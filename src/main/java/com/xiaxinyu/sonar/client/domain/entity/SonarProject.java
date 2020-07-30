package com.xiaxinyu.sonar.client.domain.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-15
 */
public class SonarProject {
    @ApiModelProperty(value = "projectKey", required = true)
    private String projectKey;
    @ApiModelProperty(value = "projectName", required = true)
    private String projectName;
    @ApiModelProperty(value = "填空就可以", required = false)
    private String projectProperty;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectProperty() {
        return projectProperty;
    }

    public void setProjectProperty(String projectProperty) {
        this.projectProperty = projectProperty;
    }
}
