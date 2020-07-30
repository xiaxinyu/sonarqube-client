package com.xiaxinyu.sonar.client.api;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.xiaxinyu.sonar.client.SonarClientApplication;
import com.xiaxinyu.sonar.client.domain.entity.SonarComponentIssues;
import com.xiaxinyu.sonar.client.domain.query.SonarComponentIssuesQuery;
import com.xiaxinyu.sonar.client.service.SonarComponentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SonarClientApplication.class})
public class SonarIssuesClientTest {
    @Autowired
    SonarIssuesClient sonarIssuesClient;

    @Autowired
    SonarComponentService sonarComponentService;

    private SonarComponentIssues defaultSonarComponentIssuesCondition() {
        SonarComponentIssues condition = new SonarComponentIssues();
        condition.setAsc("true");
        condition.setStatuses("OPEN");
        condition.setFacets("types,severities,resolutions");
        condition.setPageindex("1");
        condition.setPagesize("499");
        return condition;
    }

    @Test
    public void testQuerySonarComponentIssues() {
        SonarComponentIssues condition = defaultSonarComponentIssuesCondition();
        String projectKey = "dba43390-f1bf-4277-b721-def6bff96997";

        String projectUuid = sonarComponentService.querySonarComponentUuid(projectKey);
        condition.setComponentUuids(projectUuid);

        SonarComponentIssuesQuery query = new SonarComponentIssuesQuery();
        query.setSonarComponentIssues(condition);
        String returnJson = sonarIssuesClient.querySonarComponentIssues(query);

        Assert.assertNotNull(returnJson);

        JSONObject result = JSONObject.parseObject(returnJson);

        String pretty = JSON.toJSONString(result, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteDateUseDateFormat);

        log.info("result={}", pretty);
    }
}
