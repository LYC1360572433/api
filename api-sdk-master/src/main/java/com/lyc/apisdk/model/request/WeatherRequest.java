package com.lyc.apisdk.model.request;

import com.lyc.apisdk.model.enums.RequestMethodEnum;
import com.lyc.apisdk.model.params.WeatherParams;
import com.lyc.apisdk.model.response.NameResponse;
import com.lyc.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Description: 获取天气请求
 */
@Accessors(chain = true)
public class WeatherRequest extends BaseRequest<WeatherParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/weather";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
