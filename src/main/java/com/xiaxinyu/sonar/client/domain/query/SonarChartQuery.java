package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarTimemachine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class SonarChartQuery {

    private static final Logger logger = LoggerFactory.getLogger(SonarIssuesQuery.class);
    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setSresource(String resource) {
        this.queryParams.put("resource", resource);
    }

    public void setMetrics(String metrics) {
        this.queryParams.put("metrics", metrics);
    }

    public void setSonarTimemachine(SonarTimemachine sonarTimemachine) {
        this.queryParams.put("metrics", sonarTimemachine.getMetrics());
        this.queryParams.put("resource", sonarTimemachine.getComponentKey());
    }

    public Map<String, Object> getQueryParams() {
        return queryParams;
    }
}
