package integrations.services;

import integrations.utils.AppProperties;
import integrations.utils.HttpHeaders;
import integrations.utils.Responses.ObjectNodeResponse;
import okhttp3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class RESTCalls {

    private static final Logger logger = LogManager.getLogger(RESTCalls.class);
    private HttpHeaders headers = new HttpHeaders();
    private AppProperties appProperties = AppProperties.getInstance();
    //OkHttpClient JSON header
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public RESTCalls() {
    }

    /**
     * GetMethod - GET record by RecordId
     * @param recordId   Insightly recordId
     * @param recordType RecordType (object) to search e.g. Contacts, Organisations, Leads
     * @return ObjectNodeResponse {Result, StatusCode, Response}
     */
    public ObjectNodeResponse getMethod(String recordId, String recordType) {
        //BaseURL
        HttpUrl.Builder baseUrl = new HttpUrl.Builder()
            .scheme("https")
                .host(appProperties.getApiHost())
                .addPathSegment(appProperties.getApiVersion())
                .addPathSegment(recordType)
                .addPathSegment(recordId)
            .addQueryParameter("count_total", "true");

        Headers okHttpHeaders = Headers.of(headers.headers_Insightly());

        return sendRequest(baseUrl.build().url(), okHttpHeaders, "GET", null);
    }

    /**
     * GetMethod - Get record's details by RecordId
     * @param recordId     Insightly recordId
     * @param recordType   RecordType (object) to search e.g. Contacts, Organisations, Leads
     * @param metaDataType Sub method to an object e.g. Dates, Emails Domains, Events, File Attachments, Image, Links, Notes etc
     * @return ObjectNodeResponse {Result, StatusCode, Response}
     */
    public ObjectNodeResponse getMethodDetails(String recordId, String recordType, String metaDataType) {
        //Insightly BaseURL
        HttpUrl.Builder baseUrl = new HttpUrl.Builder()
                .scheme("https")
                .host(appProperties.getApiHost())
                .addPathSegment(appProperties.getApiVersion())
                .addPathSegment(recordType)
                .addPathSegment(recordId)
                .addPathSegment(metaDataType)
                .addQueryParameter("count_total", "true");

        Headers okHttpHeaders = Headers.of(headers.headers_Insightly());

        return sendRequest(baseUrl.build().url(), okHttpHeaders, "GET", null);
    }

    /**
     * @param recordType RecordType (object) to search e.g. Contacts, Organisations, Leads
     * @param fieldName record's attribute name
     * @param fieldValue record's attribute value
     * @return ObjectNodeResponse {Result, StatusCode, Response}
     */
    public ObjectNodeResponse searchMethod(String recordType, String fieldName, String fieldValue, String updatedAfterUtc) {
        //Insightly BaseURL
        HttpUrl.Builder baseUrl = new HttpUrl.Builder()
                .scheme("https")
                .host(appProperties.getApiHost())
                .addPathSegment(appProperties.getApiVersion())
                .addPathSegment(recordType)
                .addPathSegment("Search")
                .addQueryParameter("field_name", fieldName)
                .addQueryParameter("field_value", fieldValue)
                .addQueryParameter("count_total", "true");

        if (updatedAfterUtc != null) {
            baseUrl.addQueryParameter("updated_after_utc", updatedAfterUtc);
        }

        Headers okHttpHeaders = Headers.of(headers.headers_Insightly());

        return sendRequest(baseUrl.build().url(), okHttpHeaders, "GET", null);
    }

    /**
     * Fetch file by recordId
     * @param recordId Unique Record Id
     * @return byte array
     */
    public ObjectNodeResponse getFileAttachmentsFromInsightly(String recordId) {
        //Insightly BaseURL
        HttpUrl.Builder baseUrl = new HttpUrl.Builder()
                .scheme("https")
                .host(appProperties.getApiHost())
                .addPathSegment(appProperties.getApiVersion())
                .addPathSegment("FileAttachments")
                .addPathSegment(recordId)
                .addQueryParameter("count_total", "true");

        headers.headers_Insightly().put("Accept", "application/octet-stream");
        headers.headers_Insightly().put("Content-Type", "application/json");
        Headers okHttpHeaders = Headers.of(headers.headers_Insightly());

        Request request = new Request.Builder()
                .url(baseUrl.build().url())
                .get()
                .headers(okHttpHeaders)
                .build();

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new RetryInterceptor())
                .build();

        try {
            Response response = httpClient.newCall(request).execute();

            String result = "failure";
            if (response.isSuccessful()) {
                result = "success";
            }
            int statusCode = response.code();
            String body = null;
            if (statusCode == 200) {
                if (response.body() != null) {
                    InputStream inputStream = response.body().byteStream();
                    byte[] buffer = new byte[8192];
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        baos.write(buffer, 0, bytesRead);
                    }
                    body = new String(baos.toByteArray());
                    response.close();
                    return new ObjectNodeResponse(result, statusCode, body);
                } else {
                    logger.warn("Response body is empty!");
                }
            } else {
                body = response.body().string();
                response.close();
                return new ObjectNodeResponse("failure", statusCode, body);
            }
        } catch (IOException e) {
            return new ObjectNodeResponse("failure", -1, e.getMessage());
        }

        return null;
    }

    /**
     * @param recordType RecordType (object) to search e.g. Contacts, Organisations, Leads
     * @param updateType POST or PUT request
     * @param body update payload
     * @return ObjectNodeResponse {Result, StatusCode, Response}
     */
    public ObjectNodeResponse updateMethod(String recordType, String updateType, String body) {
        //Insightly BaseURL
        HttpUrl.Builder baseUrl = new HttpUrl.Builder()
                .scheme("https")
                .host(appProperties.getApiHost())
                .addPathSegment(appProperties.getApiVersion())
                .addPathSegment(recordType);

        URL url = baseUrl.build().url();

        Headers okHttpHeaders = Headers.of(headers.headers_Insightly());

        RequestBody responseBody = RequestBody.create(JSON, body);

        Request request = null;
        if (updateType.equalsIgnoreCase("POST")) {
            request = new Request.Builder()
                    .url(url)
                    .post(responseBody)
                    .headers(okHttpHeaders)
                    .build();
        } else if (updateType.equalsIgnoreCase("PUT")) {
            request = new Request.Builder()
                    .url(url)
                    .put(responseBody)
                    .headers(okHttpHeaders)
                    .build();
        }

        return processRequest(request);
    }

    /**
     * @param recordId     Insightly recordId
     * @param recordType   RecordType (object) to search e.g. Contacts, Organisations, Leads
     * @param updateType   POST or PUT request
     * @param body         update payload
     * @param metaDataType Sub method to an object e.g. Dates, Emails Domains, Events, File Attachments, Image, Links, Notes etc
     * @return ObjectNodeResponse {Result, StatusCode, Response}
     */
    public ObjectNodeResponse updateMethodDetails(String recordId, String recordType, String updateType, String body, String metaDataType) {
        //Insightly BaseURL
        HttpUrl.Builder baseUrl = new HttpUrl.Builder()
                .scheme("https")
                .host(appProperties.getApiHost())
                .addPathSegment(appProperties.getApiVersion())
                .addPathSegment(recordType)
                .addPathSegment(recordId)
                .addPathSegment(metaDataType);

        //Insightly header
        Headers okHttpHeaders = Headers.of(headers.headers_Insightly());
        //OkHTTP request payload
        RequestBody responseBody = RequestBody.create(JSON, body);
        return sendRequest(baseUrl.build().url(), okHttpHeaders, updateType, responseBody);
    }


    /**
     * @param url           baseUrl
     * @param okHttpHeaders OkHttpHeaders - Insightly API_KEY
     * @param methodType    GET or POST or PUT
     * @param body          update payload
     * @return ObjectNodeResponse {Result, StatusCode, Response}
     */
    private ObjectNodeResponse sendRequest(URL url, Headers okHttpHeaders, String methodType, RequestBody body) {
        Request request = null;
        if (methodType.equalsIgnoreCase("GET")) {
            request = new Request.Builder()
                    .url(url)
                    .get()
                    .headers(okHttpHeaders)
                    .build();
        } else if (methodType.equalsIgnoreCase("POST")) {
            request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .headers(okHttpHeaders)
                    .build();
        } else if (methodType.equalsIgnoreCase("PUT")) {
            request = new Request.Builder()
                    .url(url)
                    .put(body)
                    .headers(okHttpHeaders)
                    .build();
        } else if (methodType.equalsIgnoreCase("DELETE")) {
            request = new Request.Builder()
                    .url(url)
                    .delete()
                    .headers(okHttpHeaders)
                    .build();
        } else {
            logger.error("Method " + methodType + " not implemented!");
        }

        return processRequest(request);
    }

    /**
     * This method is used for processing HTTP requests
     * @param request OkHTTP Request
     * @return ObjectNodeResponse {Result, StatusCode, Response}
     */
    private ObjectNodeResponse processRequest(Request request) {
        if (request == null) {
            return new ObjectNodeResponse("failure", -1, "Ops! Request object is null!");
        }

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new RetryInterceptor())
                .build();

        try {
            Response response = httpClient.newCall(request).execute();

            //Printing Headers
            logger.info("Headers");
            Map<String, List<String>> headers = response.headers().toMultimap();
            Set<Map.Entry<String, List<String>>> headerSet = headers.entrySet();
            for (Map.Entry<String, List<String>> entry : headerSet) {
                System.out.println("\t" + entry.getKey() + "\t" + Arrays.toString(entry.getValue().toArray()));
            }
            System.out.println("\n");


            String result = "failure";
            if (response.isSuccessful()) {
                result = "success";
            }
            int statusCode = response.code();
            String body = null;
            if (response.body() != null) {
                body = response.body().string();
            }

            response.close();

            return new ObjectNodeResponse(result, statusCode, body);
        } catch (IOException e) {
            return new ObjectNodeResponse("failure", -1, e.getMessage());
        }
    }

    /**
     * Custom Retry Interceptor - Retries HTTP requests when Insightly HTTP call status code = 429.
     * Thread sleeps for 800 to 1200 ms and retries everytime it encounters 429
     */
    private static class RetryInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            //Intercept Request
            Request request = chain.request();
            Response response = chain.proceed(request);

            int retryCount = 0;
            while (response.code() == 429) {
                logger.info("State code 429. Retrying request. Attempt no. " + retryCount);
                retryCount++;

                int randomNum = ThreadLocalRandom.current().nextInt(800, 1200);
                try {
                    Thread.sleep(randomNum);
                } catch (InterruptedException e2) {
                    logger.error("Thread interruption error... " + e2.getMessage());
                }

                response = chain.proceed(request);
            }
            return response;
        }
    }

}
