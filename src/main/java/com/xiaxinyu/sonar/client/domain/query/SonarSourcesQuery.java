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
public class SonarSourcesQuery {
    private static final Logger logger = LoggerFactory.getLogger(SonarSourcesQuery.class);

    Map<String, Object> queryParams = new HashMap<String, Object>();

    // bugs,reliability_rating,complexity,code_smells,duplicated_lines_density,new_violations,security_rating,ncloc,violations,vulnerabilities,new_bugs,sqale_rating
    //多个维度用逗号隔开
    public void setMetrics(String key) {
        this.queryParams.put("metrics", key);
    }

    public void setProjectName(String name) {
        this.queryParams.put("resource", name);
    }

    public Map<String, Object> getQueryParams() {
        return queryParams;
    }

}
