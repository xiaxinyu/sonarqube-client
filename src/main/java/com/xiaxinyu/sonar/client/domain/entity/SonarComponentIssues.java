package com.xiaxinyu.sonar.client.domain.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * 功能描述：根据bug条件处理方式以及规则查询项目的问题
 *
 * @author: gw
 * @date: ${date} ${time}
 */
public class SonarComponentIssues {

    @ApiModelProperty(value = "是否排序字段:ture 和 false", required = true)
    private String asc;
    @ApiModelProperty(value = "额外字段 一般填_all            _all, comments, languages, actionPlans, rules, transitions, actions, users", required = true)
    private String additionalFields;
    @ApiModelProperty(value = "当前页 ", required = true)
    private String pageindex;
    @ApiModelProperty(value = "页面大小", required = true)
    private String pagesize;
    @ApiModelProperty(value = "维度方面   facets   如：    severities, statuses, resolutions, actionPlans, projectUuids, rules, assignees, assigned_to_me, reporters, authors, moduleUuids, fileUuids, directories, languages, tags, types, createdAt")
    private String facets;

    @ApiModelProperty(value = "")
    private String severities;
    @ApiModelProperty(value = "路径")
    private String directories;
    @ApiModelProperty(value = " bug的状态 如：OPEN")
    private String statuses;

    @ApiModelProperty(value = "文件的uuids")
    private String fileUuids;

    @ApiModelProperty(value = "解决状态 如：  FALSE-POSITIVE, WONTFIX, FIXED, REMOVED")
    private String resolutions;
    @ApiModelProperty(value = " rule key")
    private String rules;
    @ApiModelProperty(value = "  类型：如：CODE_SMELL, BUG, VULNERABILITY]")
    private String types;
    @ApiModelProperty(value = "项目的uuid  ")
    private String componentUuids;

    private String s; //sonar7.7增加的参数 Sort field
    private boolean resolved;
    public String getComponentUuids() {
        return componentUuids;
    }

    public void setComponentUuids(String componentUuids) {
        this.componentUuids = componentUuids;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getResolutions() {
        return resolutions;
    }

    public void setResolutions(String resolutions) {
        this.resolutions = resolutions;
    }

    public String getFacets() {
        return facets;
    }

    public void setFacets(String facets) {
        this.facets = facets;
    }

    public String getPagesize() {
        return pagesize;
    }

    public void setPagesize(String pagesize) {
        this.pagesize = pagesize;
    }

    public String getPageindex() {
        return pageindex;
    }

    public void setPageindex(String pageindex) {
        this.pageindex = pageindex;
    }

    public String getAdditionalFields() {
        return additionalFields;
    }

    public void setAdditionalFields(String additionalFields) {
        this.additionalFields = additionalFields;
    }

    public String getAsc() {
        return asc;
    }

    public void setAsc(String asc) {
        this.asc = asc;
    }


    public String getSeverities() {
        return severities;
    }

    public void setSeverities(String severities) {
        this.severities = severities;
    }

    public String getDirectories() {
        return directories;
    }

    public void setDirectories(String directories) {
        this.directories = directories;
    }

    public String getFileUuids() {
        return fileUuids;
    }

    public void setFileUuids(String fileUuids) {
        this.fileUuids = fileUuids;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }

    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }

    public boolean getResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}
