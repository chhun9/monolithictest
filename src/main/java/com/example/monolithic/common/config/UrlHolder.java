package com.example.monolithic.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "rest-url")
public class UrlHolder {
    private String bodyMock;
    private String engineMock;
    private String wheelMock;
}
