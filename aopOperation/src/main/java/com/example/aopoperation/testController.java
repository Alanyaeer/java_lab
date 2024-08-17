package com.example.aopoperation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/hello")
public class testController {
    private static final Logger logger = LoggerFactory.getLogger(testController.class);

    @GetMapping("/hll")
    public void good() throws InterruptedException {
        Thread.sleep(2000);
        logger.info("fafe");
    }
}
