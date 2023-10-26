package icu.qimuu.qiapisdkdemo;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class SdkDemoApplicationTests {

    @Test
    public void shiFenMiaoToSeconds() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(date);
    }
}

