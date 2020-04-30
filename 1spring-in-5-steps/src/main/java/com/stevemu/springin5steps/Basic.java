package com.stevemu.springin5steps;

import com.stevemu.springin5steps.scope.PersonDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.stevemu.springin5steps.basics.BinarySearchImpl;

@SpringBootApplication
public class Basic {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl( new QuickSort());
//		System.out.println(result);
		
		ConfigurableApplicationContext run = SpringApplication.run(Basic.class, args);
		
		BinarySearchImpl bs = run.getBean(BinarySearchImpl.class);
//		BinarySearchImpl bs2 = run.getBean(BinarySearchImpl.class);
//		PersonDAO p = run.getBean(PersonDAO.class);
//
//
//
//		System.out.println(p.getJdbcConnection());
//		System.out.println(bs2);
//
//		int result = bs.binarySearch(new int[] {123, 6, 2}, 3);
//		System.out.println(result);

	}

}
