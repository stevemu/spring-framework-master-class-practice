package com.example.springtest;

import com.example.springtest.myTest.BinarySearch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan
public class SpringTestApplication {

	public static void main(String[] args) {


		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTestApplication.class)) {
			BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
			binarySearch.getSort().sort();

		}


	}

	@PostConstruct
	public void pc() {
		System.out.println("pc at SpringTestApplication");
	}

}
