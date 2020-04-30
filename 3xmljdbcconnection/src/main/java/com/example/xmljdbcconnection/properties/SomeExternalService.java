package com.example.xmljdbcconnection.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalService {
    // from property file

    @Value("${external.service.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    public String returnServiceURL() {
        return url;
    }

    public String getUsername() {
        return username;
    }
}
