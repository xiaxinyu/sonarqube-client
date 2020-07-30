package com.xiaxinyu.sonar.client.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.wsclient.kevinsawicki.HttpRequest;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

/**
 * @program: devopsci
 * @description: sonar扩展http类
 * @author: dushaohua5
 * @create: 2019-03-22 19:51
 */
public class HttpRequestExtendFactory {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final int[] RESPONSE_SUCCESS = new int[]{200, 201, 204};
    private static final int[] RESPONSE_NOT_FOUND = new int[]{404};
    private final String baseUrl;
    private String login;
    private String password;
    private String proxyHost;
    private String proxyLogin;
    private String proxyPassword;
    private int proxyPort;
    private int connectTimeoutInMilliseconds;
    private int readTimeoutInMilliseconds;

    public HttpRequestExtendFactory(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public HttpRequestExtendFactory setLogin(String login) {
        this.login = login;
        return this;
    }

    public HttpRequestExtendFactory setPassword(String password) {
        this.password = password;
        return this;
    }

    public HttpRequestExtendFactory setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
        return this;
    }

    public HttpRequestExtendFactory setProxyLogin(String proxyLogin) {
        this.proxyLogin = proxyLogin;
        return this;
    }

    public HttpRequestExtendFactory setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
        return this;
    }

    public HttpRequestExtendFactory setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
        return this;
    }

    public HttpRequestExtendFactory setConnectTimeoutInMilliseconds(int connectTimeoutInMilliseconds) {
        this.connectTimeoutInMilliseconds = connectTimeoutInMilliseconds;
        return this;
    }

    public HttpRequestExtendFactory setReadTimeoutInMilliseconds(int readTimeoutInMilliseconds) {
        this.readTimeoutInMilliseconds = readTimeoutInMilliseconds;
        return this;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public String getProxyHost() {
        return this.proxyHost;
    }

    public String getProxyLogin() {
        return this.proxyLogin;
    }

    public String getProxyPassword() {
        return this.proxyPassword;
    }

    public int getProxyPort() {
        return this.proxyPort;
    }

    public int getConnectTimeoutInMilliseconds() {
        return this.connectTimeoutInMilliseconds;
    }

    public int getReadTimeoutInMilliseconds() {
        return this.readTimeoutInMilliseconds;
    }

    public String get(String wsUrl, Map<String, Object> queryParams) {
        HttpRequest request = this.prepare(HttpRequest.get(this.buildUrl(wsUrl), queryParams, true));
        return this.execute(request);
    }

    public String handleGet(String wsUrl, Map<String, Object> queryParams) {
        HttpRequest request = this.prepare(HttpRequest.get(this.buildUrl(wsUrl), queryParams, true));
        return this.process(request);
    }

    public String post(String wsUrl, Map<String, Object> queryParams) {
        HttpRequest request = this.prepare(HttpRequest.post(this.buildUrl(wsUrl), true, new Object[0])).form(queryParams, "UTF-8");
        return this.execute(request);
    }

    public String part(String wsUrl, String name, File file) {
        HttpRequest request = this.prepare(HttpRequest.post(this.buildUrl(wsUrl), true, new Object[0])).part(name, file);
        return this.execute(request);
    }

    public String part(String wsUrl, String name, InputStream input) {
        HttpRequest request = this.prepare(HttpRequest.post(this.buildUrl(wsUrl), true, new Object[0])).part(name, input);
        return this.execute(request);
    }

    private String buildUrl(String part) {
        StringBuilder url = new StringBuilder();
        url.append(this.baseUrl);
        if (!part.startsWith("/")) {
            url.append('/');
        }

        url.append(part);
        return url.toString();
    }

    private String execute(HttpRequest request) {
        try {
            if (this.isSuccess(request)) {
                return request.body("UTF-8");
            } else {
                String body = request.body();
                logger.error("Error {} on" + request.url() + ": {}", request.code(), body);
                throw new RuntimeException(body);
            }
        } catch (HttpRequest.HttpRequestException var3) {
            logger.error("Fail to request " + request.url() + ": {}", request.body());
            throw new RuntimeException(var3.getMessage());
        }
    }

    private String process(HttpRequest request) {
        try {
            if (this.isSuccess(request)) {
                return request.body("UTF-8");
            } else if (this.isNotFound(request)) {
                logger.warn("请求：{} 状态码：{} " + request.url(), request.code());
                return null;
            } else {
                String body = request.body();
                logger.error("请求：{} 状态码：{} 响应：{}" + request.url(), request.code(), body);
                throw new RuntimeException(body);
            }
        } catch (HttpRequest.HttpRequestException var3) {
            logger.error("请求出现错误： {} : {}", request.url(), request.body());
            throw new RuntimeException(var3.getMessage());
        }
    }

    private boolean isSuccess(HttpRequest request) {
        return Arrays.binarySearch(RESPONSE_SUCCESS, request.code()) >= 0;
    }

    private boolean isNotFound(HttpRequest request) {
        return Arrays.binarySearch(RESPONSE_NOT_FOUND, request.code()) >= 0;
    }

    private HttpRequest prepare(HttpRequest request) {
        if (this.proxyHost != null) {
            request.useProxy(this.proxyHost, this.proxyPort);
            if (this.proxyLogin != null) {
                request.proxyBasic(this.proxyLogin, this.proxyPassword);
            }
        }

        request.acceptGzipEncoding().uncompress(true).acceptJson().acceptCharset("UTF-8").connectTimeout(this.connectTimeoutInMilliseconds).readTimeout(this.readTimeoutInMilliseconds).trustAllCerts().trustAllHosts();
        if (this.login != null) {
            request.basic(this.login, this.password);
        }

        return request;
    }
}
