package com.xiaxinyu.sonar.client.domain.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:GW
 * Date: 2018-05-24
 */
public class SonarLine {
    //uuid=AVxCxNFe8vcAg_uDB4T-&from=1&to=500
    @ApiModelProperty(value = "查询文件的的uuid  如：AVxCxNFe8vcAg_uDB4T-")
    private String uuid;
    @ApiModelProperty(value = "从哪一行开始查询", required = true)
    private String from;
    @ApiModelProperty(value = "从哪一行结束查询", required = true)
    private String to;

    private String key; //sonar7.7开始 使用key 不用uuid

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
