package com.example.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties("springit")
public class SpringitProperties {

    /**
     * This is our welcome message
     */

    private String welcomeMsg = "Hello, World!";

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
}
