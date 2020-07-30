package com.xiaxinyu.sonar.client.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xiaxinyu.sonar.client.api.SonarComponentClient;
import com.xiaxinyu.sonar.client.domain.entity.SonarFavoriteMeasures;
import com.xiaxinyu.sonar.client.domain.query.SonarFavoriteMeasuresQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SonarProjectService {

    @Autowired
    SonarComponentClient sonarFavoriteMeasuresClient;

    /**
     * 查询项目的componentUuids
     * @param componentKey
     * @return
     */
    public String getProjectsUuid(String componentKey) {
        //根据key获取uuid
        String componentUuids = "";
        SonarFavoriteMeasures sonarFavoriteMeasures = new SonarFavoriteMeasures();
        sonarFavoriteMeasures.setPs("499");
        sonarFavoriteMeasures.setFilter("");
        //sonarFavoriteMeasures.setFilter("query = "+componentKey);  //filter 7.7版本 接口必须参数
        sonarFavoriteMeasures.setFacets("");

        String json = searchAllProjects(sonarFavoriteMeasures);
        JSONObject pmap = JSON.parseObject(json) ;
        JSONArray pmapJSONArray =pmap.getJSONArray("components");
        for (Integer i = 0; i < pmapJSONArray.size(); i++) {
            if( componentKey!=null&&componentKey.equals(pmapJSONArray.getJSONObject(i).getString("key"))) {
                componentUuids = pmapJSONArray.getJSONObject(i).getString("id");
                break;
            }
        }
        return componentUuids;
    }

    /**
     * 查询所有项目
     * @param sonarFavoriteMeasures
     * @return
     */
    public String searchAllProjects(SonarFavoriteMeasures sonarFavoriteMeasures) {
        SonarFavoriteMeasuresQuery sonarFavoriteMeasuresQuery = new SonarFavoriteMeasuresQuery();
        sonarFavoriteMeasuresQuery.setSonarFavoriteMeasures(sonarFavoriteMeasures);
        String json = sonarFavoriteMeasuresClient.searchAllProjects(sonarFavoriteMeasuresQuery);
        return json;
    }
}
