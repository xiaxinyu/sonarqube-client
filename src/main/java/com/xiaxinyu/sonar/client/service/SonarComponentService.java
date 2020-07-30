package com.xiaxinyu.sonar.client.service;

/**
 * Sonar组件服务
 *
 * @author xiaxinyu
 * @date 2020/5/9
 **/
public interface SonarComponentService {

    /**
     * 查询Sonar组件
     *
     * @param projectKey sonar项目key
     * @return Sonar组件
     */
    String querySonarComponentUuid(String projectKey);
}
