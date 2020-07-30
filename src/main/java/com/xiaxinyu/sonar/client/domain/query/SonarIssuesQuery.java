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
public class SonarIssuesQuery {

    private static final Logger logger = LoggerFactory.getLogger(SonarIssuesQuery.class);

    Map<String, Object> queryParams = new HashMap<String, Object>();
    //type:bug VULNERABILITY(漏洞)CODE_SMELL（坏味道）
    public void setType(String type) {
        this.queryParams.put("type",type);
    }
    public void setComponentUuids(String componentUuids) {
        this.queryParams.put("componentUuids",componentUuids);
    }
    public void setPageSize(String pageSize) {
        this.queryParams.put("pageSize",pageSize);
    }
    public Map<String, Object> getQueryParams() {
        return queryParams;
    }

}
