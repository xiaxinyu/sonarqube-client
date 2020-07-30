package com.xiaxinyu.sonar.client.domain.entity;

public class SonarTimemachine {

   // resource=irun_collector&metrics=bugs
    private String componentKey;
    private String metrics;

    public String getMetrics() {
        return metrics;
    }

    public void setMetrics(String metrics) {
        this.metrics = metrics;
    }

    public String getComponentKey() {
        return componentKey;
    }

    public void setComponentKey(String componentKey) {
        this.componentKey = componentKey;
    }
}
