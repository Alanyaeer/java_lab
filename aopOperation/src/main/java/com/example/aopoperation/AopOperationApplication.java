package com.example.aopoperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class AopOperationApplication {
    private static final Logger logger = LoggerFactory.getLogger(AopOperationApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AopOperationApplication.class, args);
    }
}
