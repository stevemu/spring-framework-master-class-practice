package com.example.xmljdbcconnection.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DbService {
    @Value("${db.username}")
    private String username;

    public String getUsername() {
        return username;
    }
}
