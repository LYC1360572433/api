package icu.qimuu.qiapisdkdemo;

import icu.qimuu.qiapisdk.exception.ApiException;
import icu.qimuu.qiapisdk.model.response.PoisonousChickenSoupResponse;
import icu.qimuu.qiapisdk.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class SdkDemoApplicationTests {

    @Resource
    private ApiService apiService;

    @Test
    void test(){
        try {
            PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup();
            System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
        } catch (ApiException e) {
            log.error(e.getMessage());
        }
    }

}
