package com.bananalab.corecloud.util;

import com.bananalab.corecloud.ext.model.HttpClientResult;
import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.NoHttpResponseException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.net.ssl.SSLException;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.UnknownHostException;

/**
 * @ Author     ：李文龙
 * @ Date       ：Created in 10:03 2018/12/6
 * @ Description：httpClientUtils，通过设置httpclient 的retryHandler来实现自带重试机制
 * @ Modified By：
 */
@Component
public class HttpClientUtils {
    private static Logger logger = LoggerFactory.getLogger(HttpClientUtils.class);

    private static final RequestConfig REQUEST_CONFIG_TIME_OUT = RequestConfig.custom()
            .setSocketTimeout(5000)
            .setConnectTimeout(5000)
            .setConnectionRequestTimeout(5000)
            .build();

    private static PoolingHttpClientConnectionManager cm = null;

    @PostConstruct
    public void init() {
        cm = new PoolingHttpClientConnectionManager();
        cm.setMaxTotal(1000);
        cm.setDefaultMaxPerRoute(1000);
    }

    /**
     * @param isPooled 是否使用连接池
     */
    public static CloseableHttpClient getClient(boolean isPooled) {
        HttpRequestRetryHandler handler = new HttpRequestRetryHandler() {
            @Override
            public boolean retryRequest(IOException arg0, int retryTimes, HttpContext arg2) {
                if (retryTimes > 2) {
                    return false;
                }
                if (arg0 instanceof UnknownHostException || arg0 instanceof ConnectTimeoutException
                        || !(arg0 instanceof SSLException) || arg0 instanceof NoHttpResponseException) {
                    return true;
                }
                HttpClientContext clientContext = HttpClientContext.adapt(arg2);
                HttpRequest request = clientContext.getRequest();
                boolean idempotent = !(request instanceof HttpEntityEnclosingRequest);
                if (idempotent) {
                    // 如果请求被认为是幂等的，那么就重试。即重复执行不影响程序其他效果的
                    return true;
                }
                return false;
            }
        };
        if (isPooled) {
            return HttpClients.custom().setConnectionManager(cm).setRetryHandler(handler).build();
        }
        return HttpClients.createDefault();
    }

    /**
     * 发送get请求
     *
     * @return
     * @throws Exception
     */
    public HttpClientResult getRequest(URI uri) {
        HttpGet httpGet = new HttpGet(uri);
        try {
            HttpClientResult result = execGetReq(httpGet);
            if (result != null) {
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("do post fail", e.getMessage());
            return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "do post fail", null);
        }
        return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "unknown error", null);
    }

    /**
     * 发送post请求,携带json数据
     */
    public HttpClientResult postRequestWithJson(URI uri, String json) {
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeader("Content-Type", "application/json");

        httpPost.setEntity(new StringEntity(json, ContentType.create("application/json", "UTF-8")));

        try {
            HttpClientResult result = execPostReq(httpPost);
            if (result != null) {
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("do post fail", e.getMessage());
            return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "do post fail", null);
        }
        return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "unknown error", null);
    }

    /**
     * 发送post请求,携带key-value数据
     */
    public HttpClientResult postRequestWithQuery(URI uri) {
        HttpPost httpPost = new HttpPost(uri);

        try {
            HttpClientResult result = execPostReq(httpPost);
            if (result != null) {
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("do post fail", e.getMessage());
            return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "do post fail", null);
        }
        return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "unknown error", null);
    }

    /**
     * 发送POST请求，byte文件
     */
    public HttpClientResult sendPostByte(URI uri, byte[] b) {
        HttpPost httpPost = new HttpPost(uri);

        ByteArrayEntity reqEntity = new ByteArrayEntity(b);

        try {
            httpPost.setEntity(reqEntity);

            HttpClientResult result = execPostReq(httpPost);
            if (result != null) {
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("do post fail", e.getMessage());
            return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "do post fail", null);
        }
        return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "unknown error", null);
    }

    /**
     * 发送POST请求，multipart
     */
    public HttpClientResult sendPostMultipart(URI uri, byte[] b) {
        HttpPost httpPost = new HttpPost(uri);

        ByteArrayBody byteArrayBody = new ByteArrayBody(b, "test.jpg");
        FileBody bin = new FileBody(new File(""));
        StringBody comment = new StringBody("A binary file of some kind", ContentType.TEXT_PLAIN);

        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("file", byteArrayBody)
                .build();

        try {
            httpPost.setEntity(reqEntity);

            HttpClientResult result = execPostReq(httpPost);
            if (result != null) {
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("do post fail", e.getMessage());
            return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "do post fail", null);
        }
        return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "unknown error", null);
    }

    /**
     * 执行get请求
     *
     * @param httpget
     */
    private HttpClientResult execGetReq(HttpGet httpget) {
        CloseableHttpResponse response;
        try {
            response = getClient(true).execute(httpget);
        } catch (IOException e) {
            e.printStackTrace();
            return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, e.getMessage(), null);
        }

        // 请求接口成功
        if (null != response) {
            try {
                // 响应状态码
                Integer responseCode = response.getStatusLine().getStatusCode();
                if (responseCode == 200) {
                    // 返回结果
                    String result = EntityUtils.toString(response.getEntity());
                    return formatResponse(responseCode, "ok", result);
                } else {
                    return formatResponse(responseCode, "http get request error: " + httpget.getURI(), null);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, e.getMessage() + ": " + httpget.getURI(), null);
            } finally {
                try {
                    EntityUtils.consume(response.getEntity());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "response result is null", null);
        }
    }

    /**
     * 执行post请求
     *
     * @param httpPost
     */
    private HttpClientResult execPostReq(HttpPost httpPost) {
        CloseableHttpResponse response = null;
        try {
            response = getClient(true).execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
            return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, e.getMessage(), null);
        }

        // 请求接口成功
        if (null != response) {
            try {
                // 响应状态码
                Integer responseCode = response.getStatusLine().getStatusCode();
                if (responseCode == HttpStatus.SC_OK) {
                    // 返回结果
                    String result = EntityUtils.toString(response.getEntity());
                    return formatResponse(responseCode, "ok", result);
                } else {
                    return formatResponse(responseCode, "http post request error: " + httpPost.getURI(), null);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    EntityUtils.consume(response.getEntity());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "response result is null", null);
        }
        return formatResponse(HttpStatus.SC_NOT_IMPLEMENTED, "unknown error", null);
    }

    /**
     * 返回请求接口响应结果，封装到实体BaseResult
     */
    private HttpClientResult formatResponse(Integer code, String message, String result) {
        HttpClientResult httpClientResult = new HttpClientResult();
        httpClientResult.setCode(code);
        httpClientResult.setMessage(message);
        if (StringUtils.isNotEmpty(result)) {
            httpClientResult.setResult(result);
        }
        return httpClientResult;
    }
}
