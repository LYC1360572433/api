package com.api.apiinterface.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lyc.apisdk.exception.ApiException;
import com.lyc.apisdk.model.response.ResultResponse;
import com.api.apicommon.common.ErrorCode;
import com.api.apicommon.exception.BusinessException;

import java.util.Map;
import static com.api.apiinterface.utils.RequestUtils.get;


/**
 * @Description:
 */
public class ResponseUtils {
    public static Map<String, Object> responseToMap(String response) {
        return new Gson().fromJson(response, new TypeToken<Map<String, Object>>() {
        }.getType());
    }

    public static <T> ResultResponse baseResponse(String baseUrl, T params) {
        String response = null;
        try {
            response = get(baseUrl, params);
            Map<String, Object> fromResponse = responseToMap(response);
            boolean success = (boolean) fromResponse.get("success");
            ResultResponse baseResponse = new ResultResponse();
            if (!success) {
                baseResponse.setData(fromResponse);
                return baseResponse;
            }
            fromResponse.remove("success");
            baseResponse.setData(fromResponse);
            return baseResponse;
        } catch (ApiException e) {
            throw new BusinessException(ErrorCode.OPERATION_ERROR, "构建url异常");
        }
    }
}
