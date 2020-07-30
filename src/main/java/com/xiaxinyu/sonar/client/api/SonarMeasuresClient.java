package com.xiaxinyu.sonar.client.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xiaxinyu.sonar.client.constant.Constants;
import com.xiaxinyu.sonar.client.core.HttpRequestExtendFactory;
import com.xiaxinyu.sonar.client.core.SonarHttpRequestFactory;
import com.xiaxinyu.sonar.client.domain.query.SearchHistoryQuery;
import com.xiaxinyu.sonar.client.domain.query.SonarMeasuresQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GW
 * @date 2018-05-24
 * @descripton Sonar检测信息
 */
@Component
public class SonarMeasuresClient {

    private static final Logger logger = LoggerFactory.getLogger(SonarMeasuresClient.class);

    private static final String PROJECTS_MEASURES_URL = "api/measures/component";

    private static final String SEARCH_HISTORY_URL = "api/measures/search_history";

    /**
     * @param
     * @return
     */
    public Map<String, Object> queryMapSonarMeasures(SonarMeasuresQuery sonarMeasuresQuery, String language) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = sonarMeasuresQuery.getQueryParams();
        String json = httpRequestFactory.get(PROJECTS_MEASURES_URL, queryParams);
        JSONObject jsonObject = JSON.parseObject(json);
        Map<String, Object> jsMap = new HashMap<String, Object>();
        JSONObject component = jsonObject.getJSONObject("component");
        String name = component.getString("name");
        String id = component.getString("id").toString();
        String key = component.getString("key").toString();
        jsMap.put("name", name);
        jsMap.put("id", id);
        jsMap.put("key", key);
        // List<Map<String, Object>> mList = new ArrayList<Map<String, Object>>();
        JSONArray measures = component.getJSONArray("measures");
        Map<String, Object> map = new HashMap<String, Object>();
        for (int j = 0; j < measures.size(); j++) {
            String metric = measures.getJSONObject(j).getString("metric");
            if (StringUtils.isEmpty(language) && language.toLowerCase().equals("cn")) {
                metric = Constants.CONTRAST_MAP.get(metric) != null ? Constants.CONTRAST_MAP.get(metric) : metric;
            }
            String value="";
            if (metric.startsWith("new_")) {
                value = measures.getJSONObject(j).getJSONArray("periods").getJSONObject(0).getString("value");
            } else if (metric.endsWith("_rating")) {
                value = ((char) (((int) Double.parseDouble(measures.getJSONObject(j).getString("value"))) + 64) )+"" ;

            } else {
                value = measures.getJSONObject(j).getString("value");
            }
            map.put(metric,value );
        }
        jsMap.put("measure", map);
        logger.info("+======================" + JSON.toJSONString(jsMap));
        return jsMap;
    }

    /**
     *  查询检测信息
     * @param sonarMeasuresQuery 查询条件
     * @param language 国际化语言，例如cn,en。 非程序语言，例如java,python等
     * @return 检测信息Json字符串
     */
    public String querySonarMeasures(SonarMeasuresQuery sonarMeasuresQuery, String language) {
        Map<String, Object> jsMap = queryMapSonarMeasures(sonarMeasuresQuery, language);
        return JSON.toJSONString(jsMap);
    }

    public String querySonarMeasuresHistory(SearchHistoryQuery ssq) {
        HttpRequestExtendFactory httpRequestFactory = SonarHttpRequestFactory.createFactory();
        Map<String, Object> queryParams = ssq.getQueryParams();
        String json = httpRequestFactory.get(SEARCH_HISTORY_URL, queryParams);
        return json;
    }
}
