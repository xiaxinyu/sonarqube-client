package com.xiaxinyu.sonar.client.domain.query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-21
 */
public class SonarProjectQuery {

    private static final Logger logger = LoggerFactory.getLogger(SonarProjectQuery.class);

    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setProjectKey(String key) {
        this.queryParams.put("key",key);
    }
    public void setProjectName(String name) {
        this.queryParams.put("name",name);
    }
    public Map<String, Object> getQueryParams() {
        return queryParams;
    }
}
