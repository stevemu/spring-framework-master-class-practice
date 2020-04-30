package com.stevemu.springin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quick")
public class QuickSort implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
