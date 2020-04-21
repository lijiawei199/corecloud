package com.bananalab.corecloud.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: 李文龙
 * @create: 2019-06-11 13:59
 * @description:
 **/
@Component
@EnableAsync
public class TestTask {
    private static Logger logger = LoggerFactory.getLogger(TestTask.class);

    @Async
    @Scheduled(fixedDelay = 1000 * 60 * 60)
    public void fixedDelay() {

    }

    @Async
    @Scheduled(cron = "0 0 2,12 * * ?")
    public void cron() {

    }
}

