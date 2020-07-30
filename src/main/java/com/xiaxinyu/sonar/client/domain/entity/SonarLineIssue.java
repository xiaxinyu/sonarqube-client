package com.xiaxinyu.sonar.client.domain.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created with IntelliJ IDEA.获取代码详情页的bug文档说明里面包含代码修复需要的时间 bug的级别代码的评论，bug所在行等
 * Description:
 * User:GW
 * Date: 2018-05-31
 */
public class SonarLineIssue {

  @ApiModelProperty(value = "是否解决：一般填：false  true, false, yes, no", required = true)
    private String   resolved;//false
    @ApiModelProperty(value = "页面大小", required = true)
    private String    ps;//3000
    @ApiModelProperty(value = "是否排序字段:ture 和 false", required = true)
    private String asc;
    @ApiModelProperty(value = "额外字段 一般填_all            _all, comments, languages, actionPlans, rules, transitions, actions, users")
    private String additionalFields;
    @ApiModelProperty(value = "项目的uuid  ")
    private String componentUuids;
    @ApiModelProperty(value = "维度方面   facets   如：    severities, statuses, resolutions, actionPlans, projectUuids, rules, assignees, assigned_to_me, reporters, authors, moduleUuids, fileUuids, directories, languages, tags, types, createdAt")
    private String facets;
    @ApiModelProperty(value = " ")
    private String severities;
    @ApiModelProperty(value = "路径")
    private String directories;
    @ApiModelProperty(value = "文件的uuids")
    private String fileUuids;
    @ApiModelProperty(value = " rule key")
    private String rules;
    @ApiModelProperty(value = "  类型：如：CODE_SMELL, BUG, VULNERABILITY]")
    private String types;
    @ApiModelProperty(value = " bug的状态 如：OPEN")
    private String statuses;








 /*   p: 1
    ps: 50
    asc: true
    additionalFields: _all
    facets: types,resolutions,fileUuids
    resolved: false
    fileUuids: AVxCxNFe8vcAg_uDB4T-
    componentUuids: AVxCxMRbqHbQUYCitLK1*/


    public String getComponentUuids() {
        return componentUuids;
    }

    public void setComponentUuids(String componentUuids) {
        this.componentUuids = componentUuids;
    }

    public String getAdditionalFields() {
        return additionalFields;
    }

    public void setAdditionalFields(String additionalFields) {
        this.additionalFields = additionalFields;
    }

    public String getResolved() {
        return resolved;
    }

    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    public String getAsc() {
        return asc;
    }

    public void setAsc(String asc) {
        this.asc = asc;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public String getFileUuids() {
        return fileUuids;
    }

    public void setFileUuids(String fileUuids) {
        this.fileUuids = fileUuids;
    }

    public String getFacets() {
        return facets;
    }

    public void setFacets(String facets) {
        this.facets = facets;
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

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }
}
