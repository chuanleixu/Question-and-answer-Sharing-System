package com.professor.houseserver.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xuchuanlei
 * @since 2022/8/13-17:39
 **/
@Data
@Component
@ConfigurationProperties(prefix = "wx")
public class WXProperties {

    private String apiUrl;

    private String appId;

    private String secret;

    private String grantType="authorization_code";
}
