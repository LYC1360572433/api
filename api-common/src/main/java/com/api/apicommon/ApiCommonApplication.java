package com.api.apicommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description: qi api通用应用程序
 */
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class )
public class ApiCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiCommonApplication.class, args);
    }

}
