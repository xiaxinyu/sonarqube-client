package com.xiaxinyu.sonar.client.domain.entity;

import io.swagger.annotations.ApiModelProperty;

public class SonarIssuesBulkChange {
    @ApiModelProperty(value = "每个问题的uuidss")
    private String issues;// AV5-6U5yqY3SycC2fGmk,AV5-6U5yqY3SycC2fGml,AV5-6U5zqY3SycC2fGmx,AV5-6U5vqY3SycC2fGl1,AV5-6U5vqY3SycC2fGl2,AV5-6U50qY3SycC2fGm6,AV5-6U50qY3SycC2fGm3,AV5-6U5vqY3SycC2fGl3,AV5-6U50qY3SycC2fGm4,AV5-6U5vqY3SycC2fGl4,AV5-6U5uqY3SycC2fGlw,AV5-6U5vqY3SycC2fGl8,AV5-6U5uqY3SycC2fGlv,AV5-6U50qY3SycC2fGm5,AV5-6U5vqY3SycC2fGl5,AV5-6U50qY3SycC2fGmz,AV5-6U5uqY3SycC2fGlx,AV5-6U5xqY3SycC2fGmV,AV5-6U5xqY3SycC2fGmU,AV5-6U5uqY3SycC2fGlu,AV5-6U5xqY3SycC2fGmN,AV5-6U5xqY3SycC2fGmM,AV5-6U5xqY3SycC2fGmX,AV5-6U5xqY3SycC2fGmW,AV5-6U5xqY3SycC2fGmP,AV5-6U5xqY3SycC2fGmO,AV5-6U5xqY3SycC2fGmZ,AV5-6U5xqY3SycC2fGmY,AV5-6U5vqY3SycC2fGl0,AV5-6U50qY3SycC2fGm1,AV5-6U5wqY3SycC2fGmD,AV5-6U5wqY3SycC2fGmC,AV5-6U5wqY3SycC2fGmF,AV5-6U5wqY3SycC2fGmE,AV5-6U5wqY3SycC2fGmH,AV5-6U5wqY3SycC2fGmG,AV5-6U5xqY3SycC2fGmT,AV5-6U5xqY3SycC2fGmS,AV5-6U5uqY3SycC2fGls,AV5-6U5vqY3SycC2fGl-,AV5-6U5xqY3SycC2fGmR,AV5-6U5xqY3SycC2fGmQ,AV5-6U5uqY3SycC2fGlr,AV5-6U5vqY3SycC2fGl9,AV5-6U50qY3SycC2fGm2,AV5-6U5wqY3SycC2fGmL,AV5-6U5wqY3SycC2fGmK,AV5-6U5yqY3SycC2fGmd,AV5-6U5yqY3SycC2fGmc,AV5-6U5yqY3SycC2fGmb,AV5-6U5yqY3SycC2fGma,AV5-6U5yqY3SycC2fGmh,AV5-6U5yqY3SycC2fGmg,AV5-6U5yqY3SycC2fGmj,AV5-6U5yqY3SycC2fGmi,AV5-6U5yqY3SycC2fGmf,AV5-6U5yqY3SycC2fGme,AV5-6U5zqY3SycC2fGmq,AV5-6U5zqY3SycC2fGmy,AV5-6U5uqY3SycC2fGlt,AV5-6U5zqY3SycC2fGmp,AV5-6U5zqY3SycC2fGmu,AV5-6U5wqY3SycC2fGmB,AV5-6U5zqY3SycC2fGmo,AV5-6U5zqY3SycC2fGmt,AV5-6U5wqY3SycC2fGmA,AV5-6U5uqY3SycC2fGlp,AV5-6U50qY3SycC2fGm0,AV5-6U50qY3SycC2fGm7,AV5-6U5vqY3SycC2fGly,AV5-6U5vqY3SycC2fGlz,AV5-6U5uqY3SycC2fGlq,AV5-6U5wqY3SycC2fGmJ,AV5-6U5wqY3SycC2fGmI,AV5-6U5vqY3SycC2fGl6,AV5-6U5zqY3SycC2fGmv,AV5-6U5vqY3SycC2fGl7,AV5-6U5zqY3SycC2fGmw,AV5-6U5zqY3SycC2fGmn,AV5-6U5zqY3SycC2fGms,AV5-6U5wqY3SycC2fGl_,AV5-6U5zqY3SycC2fGmm,AV5-6U5zqY3SycC2fGmr
    @ApiModelProperty(value = "所做的动作 一般用 用 do_transition")
    private String actions;// do_transition
    @ApiModelProperty(value = "受托人为空的话 默认是 admin")
    private String assignAssignee;//  admin
    @ApiModelProperty(value = "类型")
    private String setType;//  BUG
    @ApiModelProperty(value = "严重类型 如MAJOR")
    private String setSeverity;//  MAJOR
    @ApiModelProperty(value = "一般为空")
    private String addTags;//
    @ApiModelProperty(value = "删除 标志一般为空")
    private String removeTags;//
    @ApiModelProperty(value = " 转变的状态：如 resolve（解决）")
    private String doTransition;//  resolve
    @ApiModelProperty(value = " 评论")
    private String comment;//
    @ApiModelProperty(value = " 文件的uuid 与 issues冲突  有文件uuid时候以文件为uuid为主  党文件uuid为空时候用issues")
    private String fileUuids;//

    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getAssignAssignee() {
        return assignAssignee;
    }

    public void setAssignAssignee(String assignAssignee) {
        this.assignAssignee = assignAssignee;
    }

    public String getSetType() {
        return setType;
    }

    public void setSetType(String setType) {
        this.setType = setType;
    }

    public String getSetSeverity() {
        return setSeverity;
    }

    public void setSetSeverity(String setSeverity) {
        this.setSeverity = setSeverity;
    }

    public String getAddTags() {
        return addTags;
    }

    public void setAddTags(String addTags) {
        this.addTags = addTags;
    }

    public String getRemoveTags() {
        return removeTags;
    }

    public void setRemoveTags(String removeTags) {
        this.removeTags = removeTags;
    }

    public String getDoTransition() {
        return doTransition;
    }

    public void setDoTransition(String doTransition) {
        this.doTransition = doTransition;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public String getFileUuids() {
        return fileUuids;
    }

    public void setFileUuids(String fileUuids) {
        this.fileUuids = fileUuids;
    }
}
