package com.xiaxinyu.sonar.client.api;

import com.alibaba.fastjson.JSONObject;
import com.xiaxinyu.sonar.client.core.HttpRequestExtendFactory;
import com.xiaxinyu.sonar.client.core.SonarHttpRequestFactory;
import com.xiaxinyu.sonar.client.domain.query.SonarFavoriteMeasuresQuery;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Sonar组件客户端
 *
 * @author xiaxinyu
 * @date 2020/5/9
 **/
@Component
@Slf4j
public class SonarComponentClient {

    private static final Logger logger = LoggerFactory.getLogger(SonarComponentClient.class);

    private static final String PROJECTS_SEARCH_PROJECTS = "/api/components/search_projects";

    private static final String COMPONENTS_APP = "/api/components/app";

    /**
     * 查询所有项目的详情
     * ps=50&facets=reliability_rating%2Csecurity_rating%2Csqale_rating%2Ccoverage%2Cduplicated_lines_density%2Cncloc%2Calert_status&filter=isFavorite
     *
     * @param sonarFavoriteMeasuresQuery
     * @return
     */
    public String searchAllProjects(SonarFavoriteMeasuresQuery sonarFavoriteMeasuresQuery) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = sonarFavoriteMeasuresQuery.getQueryParams();
        String json = httpRequestFactory.get(PROJECTS_SEARCH_PROJECTS, queryParams);
        logger.info("searchAllProjects:" + json);
        return json;
    }


    public JSONObject findComponentsApp(String projectKey) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("component", projectKey);
        String json = httpRequestFactory.get(COMPONENTS_APP, queryParams);
        logger.info("findComponentsApp‘s result: {}", json);
        if (!StringUtils.isEmpty(json)) {
            return JSONObject.parseObject(json);
        }
        return null;
    }
}
