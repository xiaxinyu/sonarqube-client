package com.xiaxinyu.sonar.client.domain.query;

import com.xiaxinyu.sonar.client.domain.entity.SonarIssuesBulkChange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class SonarIssuesBulkChangeQuery {

    /*issues: AV5-6U5yqY3SycC2fGmk,AV5-6U5yqY3SycC2fGml,AV5-6U5zqY3SycC2fGmx,AV5-6U5vqY3SycC2fGl1,AV5-6U5vqY3SycC2fGl2,AV5-6U50qY3SycC2fGm6,AV5-6U50qY3SycC2fGm3,AV5-6U5vqY3SycC2fGl3,AV5-6U50qY3SycC2fGm4,AV5-6U5vqY3SycC2fGl4,AV5-6U5uqY3SycC2fGlw,AV5-6U5vqY3SycC2fGl8,AV5-6U5uqY3SycC2fGlv,AV5-6U50qY3SycC2fGm5,AV5-6U5vqY3SycC2fGl5,AV5-6U50qY3SycC2fGmz,AV5-6U5uqY3SycC2fGlx,AV5-6U5xqY3SycC2fGmV,AV5-6U5xqY3SycC2fGmU,AV5-6U5uqY3SycC2fGlu,AV5-6U5xqY3SycC2fGmN,AV5-6U5xqY3SycC2fGmM,AV5-6U5xqY3SycC2fGmX,AV5-6U5xqY3SycC2fGmW,AV5-6U5xqY3SycC2fGmP,AV5-6U5xqY3SycC2fGmO,AV5-6U5xqY3SycC2fGmZ,AV5-6U5xqY3SycC2fGmY,AV5-6U5vqY3SycC2fGl0,AV5-6U50qY3SycC2fGm1,AV5-6U5wqY3SycC2fGmD,AV5-6U5wqY3SycC2fGmC,AV5-6U5wqY3SycC2fGmF,AV5-6U5wqY3SycC2fGmE,AV5-6U5wqY3SycC2fGmH,AV5-6U5wqY3SycC2fGmG,AV5-6U5xqY3SycC2fGmT,AV5-6U5xqY3SycC2fGmS,AV5-6U5uqY3SycC2fGls,AV5-6U5vqY3SycC2fGl-,AV5-6U5xqY3SycC2fGmR,AV5-6U5xqY3SycC2fGmQ,AV5-6U5uqY3SycC2fGlr,AV5-6U5vqY3SycC2fGl9,AV5-6U50qY3SycC2fGm2,AV5-6U5wqY3SycC2fGmL,AV5-6U5wqY3SycC2fGmK,AV5-6U5yqY3SycC2fGmd,AV5-6U5yqY3SycC2fGmc,AV5-6U5yqY3SycC2fGmb,AV5-6U5yqY3SycC2fGma,AV5-6U5yqY3SycC2fGmh,AV5-6U5yqY3SycC2fGmg,AV5-6U5yqY3SycC2fGmj,AV5-6U5yqY3SycC2fGmi,AV5-6U5yqY3SycC2fGmf,AV5-6U5yqY3SycC2fGme,AV5-6U5zqY3SycC2fGmq,AV5-6U5zqY3SycC2fGmy,AV5-6U5uqY3SycC2fGlt,AV5-6U5zqY3SycC2fGmp,AV5-6U5zqY3SycC2fGmu,AV5-6U5wqY3SycC2fGmB,AV5-6U5zqY3SycC2fGmo,AV5-6U5zqY3SycC2fGmt,AV5-6U5wqY3SycC2fGmA,AV5-6U5uqY3SycC2fGlp,AV5-6U50qY3SycC2fGm0,AV5-6U50qY3SycC2fGm7,AV5-6U5vqY3SycC2fGly,AV5-6U5vqY3SycC2fGlz,AV5-6U5uqY3SycC2fGlq,AV5-6U5wqY3SycC2fGmJ,AV5-6U5wqY3SycC2fGmI,AV5-6U5vqY3SycC2fGl6,AV5-6U5zqY3SycC2fGmv,AV5-6U5vqY3SycC2fGl7,AV5-6U5zqY3SycC2fGmw,AV5-6U5zqY3SycC2fGmn,AV5-6U5zqY3SycC2fGms,AV5-6U5wqY3SycC2fGl_,AV5-6U5zqY3SycC2fGmm,AV5-6U5zqY3SycC2fGmr
    actions[]: do_transition
    assign.assignee: admin
    set_type.type: BUG
    actions[]: set_severity
    set_severity.severity: MAJOR
    add_tags.tags:
    remove_tags.tags:
    do_transition.transition: resolve
    comment:*/
    private static final Logger logger = LoggerFactory.getLogger(SonarIssuesBulkChangeQuery.class);
    Map<String, Object> queryParams = new HashMap<String, Object>();

    public void setIssues(String issues) {
        this.queryParams.put("issues", issues);
    }

    public void setActions(String actions) {
        this.queryParams.put("actions[]", actions);
    }

    public void setType(String setType) {
        this.queryParams.put("set_type.type", setType);
    }

    public void setSeverity(String setSeverity) {
        this.queryParams.put("set_severity.severity", setSeverity);
    }

    public void setAddTags(String addTags) {
        this.queryParams.put("add_tags.tags", addTags);
    }

    public void setComment(String comment) {
        this.queryParams.put("comment", comment);
    }

    public void setDoTransition(String doTransition) {
        this.queryParams.put("do_transition.transition", doTransition);
    }

    public void setRemoveTags(String removeTags) {
        this.queryParams.put("remove_tags.tags", removeTags);
    }

    public void setAssignAssignee(String assignAssignee) {
        this.queryParams.put("assign.assignee", assignAssignee);
    }

    public void setSonarIssuesBulkChangeQuery(SonarIssuesBulkChange sonarIssuesbulkchange) {
        this.queryParams.put("issues", sonarIssuesbulkchange.getIssues());
        //this.queryParams.put("actions[]",  sonarIssuesbulkchange.getActions());
        //this.queryParams.put("assign.assignee",  sonarIssuesbulkchange.getAssignAssignee());
         //this.queryParams.put("set_type.type",  sonarIssuesbulkchange.getSetType());
        //this.queryParams.put("set_severity.severity",  sonarIssuesbulkchange.getSetSeverity());
        //this.queryParams.put("add_tags.tags",  sonarIssuesbulkchange.getActions());
       // this.queryParams.put("remove_tags.tags",  sonarIssuesbulkchange.getRemoveTags());
        //this.queryParams.put("do_transition.transition",  sonarIssuesbulkchange.getDoTransition());
        this.queryParams.put("do_transition",  sonarIssuesbulkchange.getDoTransition());
        //this.queryParams.put("comment",  sonarIssuesbulkchange.getComment());
    }

    public Map<String, Object> getQueryParams() {
        return queryParams;
    }


}
