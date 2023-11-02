package com.lyc.apisdk.config;

import com.lyc.apisdk.client.ApiClient;
import com.lyc.apisdk.service.ApiService;
import com.lyc.apisdk.service.impi.ApiServiceImpl;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 客户端配置类
 */
@Data
@Configuration
@ConfigurationProperties("lyc.api.client")
@ComponentScan
public class ApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public ApiClient ApiClient() {
        return new ApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setApiClient(new ApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
