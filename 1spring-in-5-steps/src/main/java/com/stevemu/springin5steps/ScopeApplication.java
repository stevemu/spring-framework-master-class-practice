package com.stevemu.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.stevemu.springin5steps.scope.PersonDAO;


@SpringBootApplication
public class ScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(ScopeApplication.class, args);
		
		PersonDAO pd = run.getBean(PersonDAO.class);
		PersonDAO pd2 = run.getBean(PersonDAO.class);
		
//		LOGGER.info("{}", pd);
//		LOGGER.info("{}", pd.getJdbcConnection());
//		LOGGER.info("{}", pd2);
//		LOGGER.info("{}", pd2.getJdbcConnection());

	}

}
