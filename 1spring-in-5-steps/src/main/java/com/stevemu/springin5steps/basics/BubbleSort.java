package com.stevemu.springin5steps.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Primary
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostConstruct
	public void postConstruct() {
		logger.info("postContruct");
	}

	public int[] sort(int[] numbers) {
		return numbers;
	}
}
