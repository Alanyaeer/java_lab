package com.example.redission;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

import org.junit.jupiter.api.Test;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

    static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

    // 注入 RedissonClient
    @Autowired
    RedissonClient redissonClient;

    @Test
    public void test() throws InterruptedException {
        RLock testLock = this.redissonClient.getLock("testLock");
//        new Thread(() ->{
//            try {
//                testLock.tryLock(1000, TimeUnit.SECONDS);
//                Thread.sleep(100000000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }, "thread1");
//        new Thread(()->{
//            try {
//                testLock.tryLock(1000000, TimeUnit.SECONDS);
//                System.out.println(testLock.remainTimeToLive());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }, "thread2").start();
//        Thread.sleep(500);

//        new Thread(()->{
//            int cnt = 20;
//            while(true){
//                if(cnt <= 0){
//                    testLock.forceUnlock();
//                }
//                System.out.println(testLock.remainTimeToLive());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                cnt--;
//            }
//        }).start();
        String a = "";

        testLock.tryLock(100000, TimeUnit.SECONDS);
        testLock.unlock();
    }
}