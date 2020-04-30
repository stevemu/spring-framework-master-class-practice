package com.example.xmljdbcconnection;

import com.example.xmljdbcconnection.properties.DbService;
import com.example.xmljdbcconnection.properties.SomeExternalService;
import com.example.xmljdbcconnection.xml.MyController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApp {

	private static Logger LOGGER = LoggerFactory.getLogger(PropertiesApp.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesApp.class)) {
//
//			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
//
//			System.out.println(someExternalService.getUsername());


			DbService someExternalService = applicationContext.getBean(DbService.class);
			System.out.println(someExternalService.getUsername());

		}

	}

}
