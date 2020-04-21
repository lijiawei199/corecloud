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
 * @description: 缓存定时任务
 **/
@Component
@EnableAsync
public class CacheTask {
    private static Logger logger = LoggerFactory.getLogger(CacheTask.class);

    /**
     * 处于空闲状态的服务人员缓存到内存,更新时间30秒钟
     */
    @Async
    @Scheduled(fixedDelay = 1000 * 30)
    public void ServiceUser() {
        long start = System.currentTimeMillis();


        long end = System.currentTimeMillis() - start;
    }


    @Async
    @Scheduled(fixedDelay = 1000 * 60)
    public void cron() {

    }
}

