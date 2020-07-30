package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarLineIssue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-31
 */
public class SonarLineIssueQuery {

    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setComponentUuids(String componentUuids) {
        this.queryParams.put("componentUuids",componentUuids);
    }
    public void setPs(String ps) {
        this.queryParams.put("ps",ps);
    }
    public void setAsc(String asc) {
        this.queryParams.put("asc",asc);
    }
    public void setAdditionalFields(String additionalFields) {
        this.queryParams.put("additionalFields",additionalFields);
    }

    public void setFileUuids(String fileUuids) {
        this.queryParams.put("fileUuids",fileUuids);
    }
    public void setFacets(String facets) {
        this.queryParams.put("facets",facets);
    }

    public void setStatuses(String statuses) {
        this.queryParams.put("statuses",statuses);
    }

    public void setSeverities(String severities) {
        this.queryParams.put("severities",severities);
    }

    public void setResolved(String resolved) {
        this.queryParams.put("resolved",resolved);
    }
    public void setS(String s) {
        this.queryParams.put("s",s);
    }
    public void setSonarLineIssue(SonarLineIssue s) {
        this.queryParams.put("componentUuids",s.getComponentUuids());
        this.queryParams.put("ps",s.getPs());
        this.queryParams.put("asc",s.getAsc());
        this.queryParams.put("additionalFields",s.getAdditionalFields());
        this.queryParams.put("resolved",s.getResolved());
        this.queryParams.put("fileUuids",s.getFileUuids());
        this.queryParams.put("facets",s.getFacets());
        this.queryParams.put("statuses",s.getStatuses());
        this.queryParams.put("severities",s.getSeverities());

    }
    public Map<String, Object> getQueryParams() {
        return queryParams;
    }
}
