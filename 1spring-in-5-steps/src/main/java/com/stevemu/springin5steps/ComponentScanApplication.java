package com.stevemu.springin5steps;

import com.stevemu.MyComponent2;
import com.stevemu.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.stevemu.componentscan")
@ComponentScan("com.stevemu")
public class ComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(ComponentScanApplication.class, args);

		MyComponent2 t1 = run.getBean(MyComponent2.class);
		MyComponent2 t2 = run.getBean(MyComponent2.class);

		LOGGER.info("{}", t1.getMyComponent3());
		LOGGER.info("{}", t2.getMyComponent3());



	}

}
