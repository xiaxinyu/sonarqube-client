package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarComponentIssues;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class SonarComponentIssuesQuery {
//    p: 1
//    ps: 50
//    asc: true
//    additionalFields: _all
//    facets: types,resolutions,rules
//    resolutions: FALSE-POSITIVE,WONTFIX
//    rules: squid:S1149
//    types: BUG,VULNERABILITY
//    componentUuids: AVxCxMRbqHbQUYCitLK1

    private static final Logger logger = LoggerFactory.getLogger(SonarIssuesQuery.class);

    Map<String, Object> queryParams = new HashMap<String, Object>();


    public void setFacets(String facets) {
        this.queryParams.put("facets",facets);
    }
    public void setRules(String rules) {
        this.queryParams.put("rules",rules);
    }
    public void setTypes(String types) {
        this.queryParams.put("types",types);
    }
    public void setResolutions(String resolutions) {
        this.queryParams.put("resolutions",resolutions);
    }

    //type:bug VULNERABILITY(漏洞)CODE_SMELL（坏味道）
    public void setAsc(String ase) {
        this.queryParams.put("asc",ase);
    }

    public void setAdditionalFields(String additionalFields) {
        this.queryParams.put("additionalFields",additionalFields);
    }
    public void setComponentUuids(String componentUuids) {
        this.queryParams.put("componentUuids",componentUuids);
    }
    public void setPageSize(String pageSize) {
        this.queryParams.put("ps",pageSize);
    }

    public void setPageIndex(String pageIndex) {
        this.queryParams.put("p",pageIndex);
    }

    public void setSeverities(String severities) {
        this.queryParams.put("severities",severities);
    }

    public void setFileUuids(String fileUuids) {
        this.queryParams.put("fileUuids",fileUuids);
    }


    public void setDirectories(String directories) {
        this.queryParams.put("directories",directories);
    }

    public Map<String, Object> getQueryParams() {
        return queryParams;
    }
    public void setStatuses(String statuses) {
        this.queryParams.put("statuses",statuses);
    }
    public void setSonarComponentIssues(SonarComponentIssues sonarComponentIssues) {
        this.queryParams.put("p", sonarComponentIssues.getPageindex());
        this.queryParams.put("ps", sonarComponentIssues.getPagesize());
        this.queryParams.put("componentUuids", sonarComponentIssues.getComponentUuids());
        this.queryParams.put("additionalFields", sonarComponentIssues.getAdditionalFields());
        this.queryParams.put("asc", sonarComponentIssues.getAsc());
        this.queryParams.put("facets", sonarComponentIssues.getFacets());
        this.queryParams.put("rules", sonarComponentIssues.getRules());
        this.queryParams.put("types", sonarComponentIssues.getTypes());
        this.queryParams.put("resolutions", sonarComponentIssues.getResolutions());
        this.queryParams.put("fileUuids",sonarComponentIssues.getFileUuids());
        this.queryParams.put("directories",sonarComponentIssues.getDirectories());
        this.queryParams.put("severities",sonarComponentIssues.getSeverities());
        this.queryParams.put("statuses",sonarComponentIssues.getStatuses());
        if(!StringUtils.isEmpty(sonarComponentIssues.getS())){
            this.queryParams.put("s",sonarComponentIssues.getS());
        }
        this.queryParams.put("resolved",sonarComponentIssues.getResolved());
    }
}
