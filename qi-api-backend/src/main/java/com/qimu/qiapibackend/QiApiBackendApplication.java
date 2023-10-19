package com.qimu.qiapibackend;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @Description:  api后端应用程序
 */
@SpringBootApplication
@EnableScheduling
@EnableDubbo
@MapperScan("com.qimu.qiapibackend.mapper")
public class QiApiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(QiApiBackendApplication.class, args);
    }

}
