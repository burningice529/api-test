package com.tianzong.web.apiall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.tianzong.web")
public class ApiAllApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiAllApplication.class, args);
    }

}
