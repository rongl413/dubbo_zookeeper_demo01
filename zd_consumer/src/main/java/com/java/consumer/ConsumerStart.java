package com.java.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:容磊
 * time:2020/4/11  16:42
 */
@SpringBootApplication(scanBasePackages = "com.java.consumer.*")
public class ConsumerStart {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStart.class);
    }
}
