package com.lyc.apisdk.model.request;

import com.lyc.apisdk.model.enums.RequestMethodEnum;
import com.lyc.apisdk.model.params.NameParams;
import com.lyc.apisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Description:
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
