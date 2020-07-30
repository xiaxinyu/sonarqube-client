package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarMeasures;
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
public class SonarMeasuresQuery {

    private static final Logger logger = LoggerFactory.getLogger(SonarMeasuresQuery.class);
    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setAdditionalFields(String fields) {
        this.queryParams.put("additionalFields", fields);
    }

    public void setComponentKey(String componentKey) {
        this.queryParams.put("componentKey", componentKey);
    }

    public void setMetricKeys(String metricKeys) {
        this.queryParams.put("metricKeys", metricKeys);
    }

    public void setSonarMeasures(SonarMeasures sonarMeasures) {
        this.queryParams.put("additionalFields", sonarMeasures.getAdditionalFields());
        this.queryParams.put("metricKeys", sonarMeasures.getMetricKeys());
        this.queryParams.put("componentKey", sonarMeasures.getComponentKey());
    }

    public Map<String, Object> getQueryParams() {
        return queryParams;
    }


}
