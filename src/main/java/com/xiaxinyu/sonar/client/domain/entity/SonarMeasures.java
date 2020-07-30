package com.xiaxinyu.sonar.client.domain.entity;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-24
 */
public class SonarMeasures {

    // additionalFields=periods&componentKey=irun_collector&metricKeys=bugs,new_bugs,reliability_rating
    private String additionalFields;
    private String componentKey;
    private String metricKeys;


    public String getAdditionalFields() {
        return additionalFields;
    }

    public void setAdditionalFields(String additionalFields) {
        this.additionalFields = additionalFields;
    }

    public String getComponentKey() {
        return componentKey;
    }

    public void setComponentKey(String componentKey) {
        this.componentKey = componentKey;
    }

    public String getMetricKeys() {
        return metricKeys;
    }

    public void setMetricKeys(String metricKeys) {
        this.metricKeys = metricKeys;
    }
}
