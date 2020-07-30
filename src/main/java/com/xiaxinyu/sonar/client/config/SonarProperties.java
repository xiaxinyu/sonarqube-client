package com.xiaxinyu.sonar.client.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "sonar")
public class SonarProperties {
    private String username;
    private String address;
    private String password;
    private String templatePath;
    private String senderEmail;
}
