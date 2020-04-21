package com.bananalab.corecloud.util;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: 李文龙
 * @create: 2019-10-16 11:26
 * @description: URI构建相关工具类
 **/
public class URIUtils {
    /**
     * 构建uri
     *
     * @return
     */
    public static URI buildUri(String scheme, String host, String path, Map<String, String> map) {
        List<NameValuePair> nvps = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            NameValuePair nvp = new BasicNameValuePair(entry.getKey(), entry.getValue());
            nvps.add(nvp);
        }

        URI uri = null;
        try {
            uri = new URIBuilder()
                    .setScheme(scheme)
                    .setHost(host)
                    .setPath(path)
                    .setParameters(nvps)
                    .build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }
}

