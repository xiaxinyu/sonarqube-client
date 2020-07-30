package com.xiaxinyu.sonar.client.service;

import com.xiaxinyu.sonar.client.SonarClientApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SonarClientApplication.class})
public class SonarComponentServiceTest {

    @Autowired
    SonarComponentService sonarComponentService;

    @Test
    public void testQuerySonarComponentUuid() {
        String projectKey = "dba43390-f1bf-4277-b721-def6bff96997";
        String projectUuid = sonarComponentService.querySonarComponentUuid(projectKey);
        Assert.assertTrue(!StringUtils.isEmpty(projectUuid));
        log.info("projectKey={}, projectUuid={}", projectKey, projectUuid);
    }
}
