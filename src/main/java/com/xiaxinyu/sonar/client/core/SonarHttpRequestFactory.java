package com.xiaxinyu.sonar.client.core;

import com.xiaxinyu.sonar.client.config.SonarProperties;
import com.xiaxinyu.sonar.client.utils.SpringUtils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-28
 */
public class SonarHttpRequestFactory {
    static HttpRequestExtendFactory httpRequestFactory = null;
    static  {
        SonarProperties sonar = SpringUtils.getBean(SonarProperties.class);
        httpRequestFactory=   new HttpRequestExtendFactory(sonar.getAddress());
        httpRequestFactory.setPassword(sonar.getPassword());
        httpRequestFactory.setLogin(sonar.getUsername());
    }

    public static HttpRequestExtendFactory createFactory(String password,String login) {
        httpRequestFactory.setPassword(password);
        httpRequestFactory.setLogin(login);
        return httpRequestFactory;
    }
    public static HttpRequestExtendFactory createFactory() {
        return httpRequestFactory;
    }
}
