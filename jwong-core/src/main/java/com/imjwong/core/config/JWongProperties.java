package com.imjwong.core.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * JWongProperties class
 *
 * @author J.Wong
 * @date 2020/09/25
 */
@Component
@ConfigurationProperties(
        prefix = "jwong",
        ignoreUnknownFields = false
)
@Getter
public class JWongProperties {

    private final JWongProperties.TencentCloud tencentCloud = new JWongProperties.TencentCloud();

    @Getter
    @Setter
    public static class TencentCloud {
        private Long sdkAppId;

    }

}