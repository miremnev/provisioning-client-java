/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.876
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.api;

import com.genesys.internal.common.ApiCallback;
import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;
import com.genesys.internal.common.ApiResponse;
import com.genesys.internal.common.Configuration;
import com.genesys.internal.common.Pair;
import com.genesys.internal.common.ProgressRequestBody;
import com.genesys.internal.common.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.genesys.internal.provisioning.model.ApiErrorResponse;
import com.genesys.internal.provisioning.model.ApiSuccessResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationsApi {
    private ApiClient apiClient;

    public OperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getUsedSkillsAsync
     * @param aioId Async IO ID (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsedSkillsAsyncCall(String aioId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/operations/get-used-skills";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (aioId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "_aioId", aioId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUsedSkillsAsyncValidateBeforeCall(String aioId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getUsedSkillsAsyncCall(aioId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get skills of users
     * The GET operation will return CfgSkill objects actually linked with existing CfgPerson objects
     * @param aioId Async IO ID (optional)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse getUsedSkillsAsync(String aioId) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = getUsedSkillsAsyncWithHttpInfo(aioId);
        return resp.getData();
    }

    /**
     * Get skills of users
     * The GET operation will return CfgSkill objects actually linked with existing CfgPerson objects
     * @param aioId Async IO ID (optional)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> getUsedSkillsAsyncWithHttpInfo(String aioId) throws ApiException {
        com.squareup.okhttp.Call call = getUsedSkillsAsyncValidateBeforeCall(aioId, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get skills of users (asynchronously)
     * The GET operation will return CfgSkill objects actually linked with existing CfgPerson objects
     * @param aioId Async IO ID (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsedSkillsAsyncAsync(String aioId, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUsedSkillsAsyncValidateBeforeCall(aioId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersAsync
     * @param aioId Async IO ID (optional)
     * @param limit Limit number of users to fetch (optional)
     * @param offset Skip first N matches (optional)
     * @param order Sort results ascending/descending (optional)
     * @param sortBy comma-separated list of fields to sort on, supported: firstName,lastName,userName  (optional)
     * @param filterName Users filter name (optional)
     * @param filterParameters Part of users first or last name, if filterName: FirstNameOrLastNameMatches specified.  (optional)
     * @param roles Only fetch users with specified wwe roles, comma-separated. Supported: ROLE_AGENT,ROLE_ADMIN,ROLE_SUPERVISOR  (optional)
     * @param skills Only fetch users with specified skills, comma-separated.  (optional)
     * @param userEnabled Fetch only enabled or disabled users. (optional)
     * @param userValid Fetch only valid or invalid users. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersAsyncCall(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/operations/get-users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (aioId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "_aioId", aioId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        if (filterName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterName", filterName));
        if (filterParameters != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterParameters", filterParameters));
        if (roles != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "roles", roles));
        if (skills != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skills", skills));
        if (userEnabled != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userEnabled", userEnabled));
        if (userValid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userValid", userValid));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUsersAsyncValidateBeforeCall(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getUsersAsyncCall(aioId, limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read users
     * The GET operation will fetch CfgPerson objects from configuration server, possible with filters
     * @param aioId Async IO ID (optional)
     * @param limit Limit number of users to fetch (optional)
     * @param offset Skip first N matches (optional)
     * @param order Sort results ascending/descending (optional)
     * @param sortBy comma-separated list of fields to sort on, supported: firstName,lastName,userName  (optional)
     * @param filterName Users filter name (optional)
     * @param filterParameters Part of users first or last name, if filterName: FirstNameOrLastNameMatches specified.  (optional)
     * @param roles Only fetch users with specified wwe roles, comma-separated. Supported: ROLE_AGENT,ROLE_ADMIN,ROLE_SUPERVISOR  (optional)
     * @param skills Only fetch users with specified skills, comma-separated.  (optional)
     * @param userEnabled Fetch only enabled or disabled users. (optional)
     * @param userValid Fetch only valid or invalid users. (optional)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse getUsersAsync(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = getUsersAsyncWithHttpInfo(aioId, limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid);
        return resp.getData();
    }

    /**
     * Read users
     * The GET operation will fetch CfgPerson objects from configuration server, possible with filters
     * @param aioId Async IO ID (optional)
     * @param limit Limit number of users to fetch (optional)
     * @param offset Skip first N matches (optional)
     * @param order Sort results ascending/descending (optional)
     * @param sortBy comma-separated list of fields to sort on, supported: firstName,lastName,userName  (optional)
     * @param filterName Users filter name (optional)
     * @param filterParameters Part of users first or last name, if filterName: FirstNameOrLastNameMatches specified.  (optional)
     * @param roles Only fetch users with specified wwe roles, comma-separated. Supported: ROLE_AGENT,ROLE_ADMIN,ROLE_SUPERVISOR  (optional)
     * @param skills Only fetch users with specified skills, comma-separated.  (optional)
     * @param userEnabled Fetch only enabled or disabled users. (optional)
     * @param userValid Fetch only valid or invalid users. (optional)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> getUsersAsyncWithHttpInfo(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid) throws ApiException {
        com.squareup.okhttp.Call call = getUsersAsyncValidateBeforeCall(aioId, limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read users (asynchronously)
     * The GET operation will fetch CfgPerson objects from configuration server, possible with filters
     * @param aioId Async IO ID (optional)
     * @param limit Limit number of users to fetch (optional)
     * @param offset Skip first N matches (optional)
     * @param order Sort results ascending/descending (optional)
     * @param sortBy comma-separated list of fields to sort on, supported: firstName,lastName,userName  (optional)
     * @param filterName Users filter name (optional)
     * @param filterParameters Part of users first or last name, if filterName: FirstNameOrLastNameMatches specified.  (optional)
     * @param roles Only fetch users with specified wwe roles, comma-separated. Supported: ROLE_AGENT,ROLE_ADMIN,ROLE_SUPERVISOR  (optional)
     * @param skills Only fetch users with specified skills, comma-separated.  (optional)
     * @param userEnabled Fetch only enabled or disabled users. (optional)
     * @param userValid Fetch only valid or invalid users. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersAsyncAsync(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUsersAsyncValidateBeforeCall(aioId, limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
