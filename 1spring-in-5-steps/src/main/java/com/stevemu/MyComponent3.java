package com.stevemu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MyComponent3 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public MyComponent3() {
    }


    @PostConstruct
    public void postConstruct() {
        logger.info("postContruct");
    }

}
