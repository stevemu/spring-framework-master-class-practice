package com.stevemu.springin5steps.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public JdbcConnection() {

//		System.out.println("jdbc connection");

	}

	@PostConstruct
	public void postConstruct() {
		logger.info("postContruct");
	}

	@PreDestroy
	public void preDestory() {
		System.out.println("pre desotry in JdbcConnection");
	}

}
