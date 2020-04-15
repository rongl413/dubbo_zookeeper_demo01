package com.java.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:容磊
 * time:2020/4/11  16:08
 */
@SpringBootApplication(scanBasePackages = "com.java.provider.*")
public class Provider2Start {
    public static void main(String[] args) {
        SpringApplication.run( Provider2Start.class);
    }
}
