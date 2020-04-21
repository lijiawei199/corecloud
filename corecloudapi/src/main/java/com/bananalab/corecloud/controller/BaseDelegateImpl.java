package com.bananalab.corecloud.controller; /**
 *
 */

import com.bananalab.corecloud.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author outiejun
 *
 */
public class BaseDelegateImpl {

    @Autowired
    private SnowflakeIdWorker snowflakeIdWorker;


    private String imagePath;
    private String defaultHead;

    protected static String THUMBNAIL150 = "?x-oss-process=style/150";
    protected static String THUMBNAIL360 = "?x-oss-process=style/360";
    protected static String THUMBNAIL750 = "?x-oss-process=style/750";


    protected long generateUniqueID() {
        return snowflakeIdWorker.nextId();
    }
}
