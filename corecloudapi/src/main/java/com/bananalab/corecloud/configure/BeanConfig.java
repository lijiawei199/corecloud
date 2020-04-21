package com.bananalab.corecloud.configure;

import com.aliyun.oss.OSSClient;
import com.bananalab.corecloud.util.Sms;
import com.bananalab.corecloud.util.SnowflakeIdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 李文龙
 * @create: 2019-07-26 13:15
 * @description:
 **/

@Configuration
public class BeanConfig {
    @Bean
    public Sms sms() {
        return new Sms();
    }

    @Bean
    public SnowflakeIdWorker snowflakeIdWorker() {
        return new SnowflakeIdWorker(0, 0);
    }

    @Bean
    public OSSClient ossClient() {
        String endpoint = "oss-cn-beijing.aliyuncs.com";
        String accessKeyId = "LTAI4Fr9kzTVMxJjkp8fiG7n";
        String secretAccessKey = "1Lixh4tplQ0QlD72qEux558lmFvqvq";

        return new OSSClient(endpoint, accessKeyId, secretAccessKey);
    }
}

