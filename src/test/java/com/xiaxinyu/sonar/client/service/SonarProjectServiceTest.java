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
public class SonarProjectServiceTest {

    @Autowired
    SonarProjectService sonarProjectService;

    @Test
    public void testQuerySonarComponentIssues_greater_than_500() {
        String projectKey = "dba43390-f1bf-4277-b721-def6bff96997";
        String projectUuid = sonarProjectService.getProjectsUuid(projectKey);
        Assert.assertTrue(StringUtils.isEmpty(projectUuid));
        log.info("projectKey={}, projectUuid={}", projectKey, projectUuid);
    }

    @Test
    public void testQuerySonarComponentIssues_less_than_500() {
        String projectKey = "7019def4-af93-4613-96e8-cde631e96503";
        String projectUuid = sonarProjectService.getProjectsUuid(projectKey);
        Assert.assertNotNull(projectUuid);
        Assert.assertTrue(!StringUtils.isEmpty(projectUuid));
        log.info("projectKey={}, projectUuid={}", projectKey, projectUuid);
    }
}
