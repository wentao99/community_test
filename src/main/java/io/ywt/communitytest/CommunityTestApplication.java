package io.ywt.communitytest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author MichaelYang
 */
@SpringBootApplication
@MapperScan("io/ywt/communitytest/mapper")
public class CommunityTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(CommunityTestApplication.class, args);
    }

}
