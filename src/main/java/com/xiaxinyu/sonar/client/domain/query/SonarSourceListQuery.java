package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-24
 */
public class SonarSourceListQuery {
    private static final Logger logger = LoggerFactory.getLogger(SonarSourceListQuery.class);


    // asc=false&ps=100&metricSortFilter=withMeasuresOnly&p=1&s=metric%2Cname&metricSort=bugs&baseComponentKey=irun_collector&metricKeys=bugs&strategy=leaves
//    asc:false
//    ps:100
//    metricSortFilter:withMeasuresOnly
//    p:1
//    s:metric,name
//    metricSort:bugs
//    baseComponentKey:irun_collector
//    metricKeys:bugs
//    strategy:leaves
    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setPagesize(String ps) {
        this.queryParams.put("ps", ps);
    }

    public void setPageIndex(String p) {
        this.queryParams.put("p", p);
    }

    public void setBaseComponentKey(String baseComponentKey) {
        this.queryParams.put("baseComponentKey", baseComponentKey);
    }

    public void setMetricSort(String metricSort) {
        this.queryParams.put("metricSort", metricSort);
    }

    public void setS(String s) {
        this.queryParams.put("s", s);
    }

    public void setMetricKeys(String metricKeys) {
        this.queryParams.put("metricKeys", metricKeys);
    }

    public void setStrategy(String strategy) {
        this.queryParams.put("strategy", strategy);
    }
    public void setAsc(String asc) {
        this.queryParams.put("asc", asc);
    }
    public void setSonarSource(SonarSource sonarSource) {
        this.queryParams.put("ps", sonarSource.getPagesize());
        this.queryParams.put("p", sonarSource.getPageindex());
        this.queryParams.put("baseComponentKey", sonarSource.getBaseComponentKey());
        this.queryParams.put("metricSort", sonarSource.getMetricSort());
        this.queryParams.put("s", sonarSource.getS());
        this.queryParams.put("metricKeys", sonarSource.getMetricKeys());
        this.queryParams.put("strategy", sonarSource.getStrategy());
        this.queryParams.put("strategy", sonarSource.getStrategy());
        this.queryParams.put("asc", sonarSource.getAsc());
    }

    public Map<String, Object> getQueryParams() {
        return queryParams;
    }


}
