package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarFavoriteMeasures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thymeleaf.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class  SonarFavoriteMeasuresQuery {


    //    ps: 50
    //    facets: reliability_rating,security_rating,sqale_rating,coverage,duplicated_lines_density,ncloc,alert_status
    //    filter: isFavorite

    private static final Logger logger = LoggerFactory.getLogger(SonarIssuesQuery.class);
    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setPs(String ps) {
        this.queryParams.put("ps", ps);
    }

    public void setFacets(String facets) {
        this.queryParams.put("facets", facets);
    }

    public void setFilter(String filter) {
        this.queryParams.put("filter", filter);
    }

    public void setSonarFavoriteMeasures(SonarFavoriteMeasures sonarFavoriteMeasures) {
        this.queryParams.put("ps", sonarFavoriteMeasures.getPs());
        this.queryParams.put("facets", sonarFavoriteMeasures.getFacets());
        //sonar7.7版本 filter不传可以,传则不能为空,应该是一个bug
        if (!StringUtils.isEmpty(sonarFavoriteMeasures.getFilter())  ){
            this.queryParams.put("filter", sonarFavoriteMeasures.getFilter());
        }
    }

    public Map<String, Object> getQueryParams() {
        return queryParams;
    }
}
