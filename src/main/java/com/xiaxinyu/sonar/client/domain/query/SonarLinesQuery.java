package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarLine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-21
 */
public class SonarLinesQuery {

    private static final Logger logger = LoggerFactory.getLogger(SonarLinesQuery.class);
    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setUuid(String uuid) {
        this.queryParams.put("uuid",uuid);
    }
    public void setFrom(String from) {
        this.queryParams.put("from",from);
    }
    public void setTo(String to) {
        this.queryParams.put("to",to);
    }
    public void setSonarLine(SonarLine line) {
        this.queryParams.put("to",line.getTo());
        this.queryParams.put("from",line.getFrom());
        //this.queryParams.put("uuid",line.getUuid());
        this.queryParams.put("key",line.getKey());
    }


    public Map<String, Object> getQueryParams() {
        return queryParams;
    }
}
