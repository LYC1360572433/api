package com.lyc.apisdk.model.request;

import com.lyc.apisdk.model.enums.RequestMethodEnum;
import com.lyc.apisdk.model.params.RandomWallpaperParams;
import com.lyc.apisdk.model.response.RandomWallpaperResponse;
import com.lyc.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Description:
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
