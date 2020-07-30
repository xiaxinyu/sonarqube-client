package com.xiaxinyu.sonar.client.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.xiaxinyu.sonar.client.api.SonarComponentClient;
import com.xiaxinyu.sonar.client.service.SonarComponentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Sonar组件服务
 *
 * @author xiaxinyu
 * @date 2020/5/9
 **/
@Service
@Slf4j
public class SonarComponentServiceImpl implements SonarComponentService {

    @Autowired
    SonarComponentClient sonarComponentClient;

    @Override
    public String querySonarComponentUuid(String projectKey) {
        log.info("根据项目key查询不到Sonar项目: projectKey={}", projectKey);
        JSONObject jsonObject = sonarComponentClient.findComponentsApp(projectKey);
        if (Objects.nonNull(jsonObject)) {
            return jsonObject.getString("uuid");
        }
        throw new RuntimeException(String.format("根据项目key查询不到Sonar项目：projectKey=%s", projectKey));
    }
}
