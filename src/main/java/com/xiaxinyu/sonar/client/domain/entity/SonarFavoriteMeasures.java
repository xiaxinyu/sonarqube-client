package com.xiaxinyu.sonar.client.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SonarFavoriteMeasures {

//    ps: 50
//    facets: reliability_rating,security_rating,sqale_rating,coverage,duplicated_lines_density,ncloc,alert_status
//    filter: isFavorite
    private String ps;

    private String facets;

    private String filter;

    private String q;
}
