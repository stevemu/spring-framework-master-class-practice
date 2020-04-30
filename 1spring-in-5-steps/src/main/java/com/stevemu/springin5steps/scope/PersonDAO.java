package com.stevemu.springin5steps.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("postContruct");
	}

	@PreDestroy
	public void preDestory() {
		System.out.println("pre desotry in PersonDAO");
	}

}
