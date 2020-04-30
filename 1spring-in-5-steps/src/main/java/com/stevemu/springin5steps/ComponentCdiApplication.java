package com.stevemu.springin5steps;

import com.stevemu.MyComponent2;
import com.stevemu.springin5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.stevemu.componentscan")
@ComponentScan("com.stevemu")
public class ComponentCdiApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentCdiApplication.class);

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(ComponentCdiApplication.class, args);

		SomeCDIBusiness someCDIBusiness = run.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dao1--{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());

	}

}
