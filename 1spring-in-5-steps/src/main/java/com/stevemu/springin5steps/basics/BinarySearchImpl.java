package com.stevemu.springin5steps.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// mandatory dependencies: use contructor injections
	// optional dependencies: use setter injection
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sort;

	
	
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}


//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
//

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// soring an array
		// search the array
		// return the result
		int[] sortedNumbers = sort.sort(numbers);
		System.out.println(sort);
		
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postContruct");
	}

	@PreDestroy
	public void PreDestroy() {
		logger.info("PreDestroy");
	}


}
