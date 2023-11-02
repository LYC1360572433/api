package com.lyc.apisdk.service.impi;

import com.lyc.apisdk.client.ApiClient;
import com.lyc.apisdk.exception.ApiException;
import com.lyc.apisdk.model.request.*;
import com.lyc.apisdk.model.response.LoveResponse;
import com.lyc.apisdk.model.response.PoisonousChickenSoupResponse;
import com.lyc.apisdk.model.response.RandomWallpaperResponse;
import com.lyc.apisdk.model.response.ResultResponse;
import com.lyc.apisdk.service.ApiService;
import com.lyc.apisdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;


/**
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(ApiClient apiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(apiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(ApiClient apiClient, RandomWallpaperRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(ApiClient apiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(apiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(ApiClient apiClient, HoroscopeRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(ApiClient apiClient, IpInfoRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(ApiClient apiClient, WeatherRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
