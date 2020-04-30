package com.example.xmljdbcconnection;

import com.example.xmljdbcconnection.search.BinarySearch;
import com.example.xmljdbcconnection.xml.MyController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
//@ComponentScan
public class XmljdbcconnectionApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(XmljdbcconnectionApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

//			LOGGER.info("{}", (Object)applicationContext.getBeanDefinitionNames());

//
//			BinarySearch test = applicationContext.getBean(BinarySearch.class);
//			test.getBubbleSort().sort();


			MyController myController = applicationContext.getBean(MyController.class);
			myController.test();

		}

	}

}
