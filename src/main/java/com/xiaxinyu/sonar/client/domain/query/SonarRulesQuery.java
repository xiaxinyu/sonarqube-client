package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author: GW
 * @date: ${date} ${time}
 */
public class SonarRulesQuery
{

//    f=name,langName&q=12&p=1
    private static final Logger logger = LoggerFactory.getLogger(SonarProjectQuery.class);

    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setF(String f) {
        this.queryParams.put("f",f);
    }
    public void setQ(String q) {
        this.queryParams.put("q",q);
    }
    public void setP(String p) {
        this.queryParams.put("p",p);
    }
    public Map<String, Object> getQueryParams() {
        return queryParams;
    }

    public void setSonarRules(SonarRules sonarRules) {
        this.queryParams.put("p",sonarRules.getP());
        this.queryParams.put("q",sonarRules.getQ());
        this.queryParams.put("f",sonarRules.getF());
    }
}
