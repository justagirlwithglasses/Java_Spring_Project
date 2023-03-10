package com.bnpp.rest_api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
@Getter
public class RestApiProps 
{

    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private String version;

    @Value("${app.description}")
    private String description;

    @Value("${spring.datasource.url}")
    private String url;
    
}
