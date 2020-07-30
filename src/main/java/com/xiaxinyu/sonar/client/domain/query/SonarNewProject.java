package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarProject;
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
public  class  SonarNewProject {
    private static final Logger logger = LoggerFactory.getLogger(SonarNewProject.class);

    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setNewProjectKey(SonarProject sonarProject) {
        this.queryParams.put("key",sonarProject.getProjectKey());
        this.queryParams.put("name",sonarProject.getProjectName());
    }
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
