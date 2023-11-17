package com.api.apiinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description: api接口应用程序
 */
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class )
public class ApiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiInterfaceApplication.class, args);
    }

}
