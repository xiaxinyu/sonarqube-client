package com.xiaxinyu.sonar.client.api;

import com.alibaba.fastjson.JSON;
import com.xiaxinyu.sonar.client.core.HttpRequestExtendFactory;
import com.xiaxinyu.sonar.client.core.SonarHttpRequestFactory;
import com.xiaxinyu.sonar.client.domain.query.SonarComponentIssuesQuery;
import com.xiaxinyu.sonar.client.domain.query.SonarIssuesBulkChangeQuery;
import com.xiaxinyu.sonar.client.domain.query.SonarIssuesQuery;
import com.xiaxinyu.sonar.client.domain.query.SonarLineIssueQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-21
 */
@Component
public class SonarIssuesClient {
    private static final Logger logger = LoggerFactory.getLogger(SonarIssuesClient.class);
    private static final String PROJECTS_SOURCE_URL = "/api/issues/search";
    private static final String PROJECTS_ISSUES_TYPE_URL = "/api/issues/set_type";
    private static final String PROJECTS_ISSUES_SEVERITY_URL = "api/issues/set_severity";
    private static final String PROJECTS_ISSUES_DO_TRANSITION_URL = "api/issues/do_transition";
    private static final String PROJECTS_ISSUES_ADD_COMMENT_URL = "api/issues/add_comment";
    private static final String PROJECTS_ISSUES_DELETE_COMMENT_URL = "api/issues/delete_comment";
    private static final String PROJECTS_BULK_CHANGE= "api/issues/bulk_change";


    public String querySonarComponentIssues(SonarComponentIssuesQuery sonarComponentIssuesQuery) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = sonarComponentIssuesQuery.getQueryParams();
        logger.info("查询问题参数：queryParams={}", JSON.toJSONString(queryParams));
        String json = httpRequestFactory.get(PROJECTS_SOURCE_URL, queryParams);
        logger.debug("Correctly get response of querying sonar component issues. Message={}", json);
        return json;
    }

    /**
     * 查询问题
     *
     * @param sonarIssuesQuery
     * @return
     */
    public String queryIssues(SonarIssuesQuery sonarIssuesQuery) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = sonarIssuesQuery.getQueryParams();
        String json = httpRequestFactory.get(PROJECTS_SOURCE_URL, queryParams);
        logger.info("=========" + json);
        return json;
    }


    /**
     * 查询问题
     *
     * @param
     * @return
     */
    public String querylineIssues(SonarLineIssueQuery sonarLineIssueQuery) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = sonarLineIssueQuery.getQueryParams();
        String json = httpRequestFactory.get(PROJECTS_SOURCE_URL, queryParams);
        logger.info("=========" + json);
        return json;
    }

    public String setSonarIssuesType(String type, String issue) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = new HashMap<String, Object>();
        queryParams.put("type", type);
        queryParams.put("issue", issue);
        String json = httpRequestFactory.post(PROJECTS_ISSUES_TYPE_URL, queryParams);
        logger.info("=========" + json);
        return json;
    }

    public String setSonarIssueSeverity(String severity, String issue) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = new HashMap<String, Object>();
        queryParams.put("severity", severity);
        queryParams.put("issue" ,issue);
        String json = httpRequestFactory.post(PROJECTS_ISSUES_SEVERITY_URL, queryParams);
        logger.info("=========" + json);
        return json;
    }


    public String setSonarIssuesTransition(String transition, String issue) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = new HashMap<String, Object>();
        queryParams.put("transition", transition);
        queryParams.put("issue", issue);
        String json = httpRequestFactory.post(PROJECTS_ISSUES_DO_TRANSITION_URL, queryParams);
        logger.info("=========" + json);
        return json;
    }

    public String sonarIssuesAddComment(String text, String issue) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = new HashMap<String, Object>();
        queryParams.put("text", text);
        queryParams.put("issue", issue);
        String json = httpRequestFactory.post(PROJECTS_ISSUES_ADD_COMMENT_URL, queryParams);
        logger.info("=========" + json);
        return json;
    }

    public String sonarIssuesDeleteComment(String key) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = new HashMap<String, Object>();
        queryParams.put("key", key);
        String json = httpRequestFactory.post(PROJECTS_ISSUES_DELETE_COMMENT_URL, queryParams);
        logger.info("=========" + json);
        return json;
    }

    public String sonarIssuesBulkChange(SonarIssuesBulkChangeQuery sonarIssuesBulkChangeQuery) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = sonarIssuesBulkChangeQuery.getQueryParams();
        String json = httpRequestFactory.post(PROJECTS_BULK_CHANGE, queryParams);
        return json;
    }
}