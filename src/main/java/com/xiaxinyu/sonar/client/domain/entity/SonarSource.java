package com.xiaxinyu.sonar.client.domain.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-24
 */
public class SonarSource{
    @ApiModelProperty(value = "是否排序字段:ture 和 false", required = true)
    private String asc;
    @ApiModelProperty(value = "当前页面", required = true)
    private String pageindex;
    @ApiModelProperty(value = "固定填发填withMeasuresOnly就可以了", required = true)
    private String metricSortFilter;
    @ApiModelProperty(value = "当前也页的大小", required = true)
    private String pagesize;
    @ApiModelProperty(value = "固定填发 metricPeriod,name 或者 metric,name不同类型填的值不一样", required = true)
    private String s;
    @ApiModelProperty(value = "必须在metricKeys里面选择", required = true)
    private String metricSort;
    @ApiModelProperty(value = "项目key  可以为空 ")
    private String baseComponentKey;
    @ApiModelProperty(value = "获取测试维度名字", required = true)
    private String metricKeys;
    @ApiModelProperty(value = "策略类型（固定填法） 填写:leaves", required = true)
    private String strategy;

    public String getAsc() {
        return asc;
    }

    public void setAsc(String asc) {
        this.asc = asc;
    }

    public String getMetricSortFilter() {
        return metricSortFilter;
    }

    public void setMetricSortFilter(String metricSortFilter) {
        this.metricSortFilter = metricSortFilter;
    }


    public String getPageindex() {
        return pageindex;
    }

    public void setPageindex(String pageindex) {
        this.pageindex = pageindex;
    }

    public String getPagesize() {
        return pagesize;
    }

    public void setPagesize(String pagesize) {
        this.pagesize = pagesize;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getMetricSort() {
        return metricSort;
    }

    public void setMetricSort(String metricSort) {
        this.metricSort = metricSort;
    }

    public String getBaseComponentKey() {
        return baseComponentKey;
    }

    public void setBaseComponentKey(String baseComponentKey) {
        this.baseComponentKey = baseComponentKey;
    }

    public String getMetricKeys() {
        return metricKeys;
    }

    public void setMetricKeys(String metricKeys) {
        this.metricKeys = metricKeys;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
