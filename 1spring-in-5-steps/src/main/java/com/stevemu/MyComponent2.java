package com.stevemu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyComponent2 {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MyComponent3 myComponent3;

    public MyComponent2() {

    }

    @PostConstruct
    public void postConstruct() {
        logger.info("postContruct");
    }


    public MyComponent3 getMyComponent3() {
        return myComponent3;
    }

    public void setMyComponent3(MyComponent3 myComponent3) {
        this.myComponent3 = myComponent3;
    }
}
