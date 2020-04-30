package com.example.springtest.myTest;

import javafx.scene.chart.BubbleChart;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BubbleSort implements Sort {
    @Override
    public void sort() {

    }

    @PostConstruct
    public void pc() {
        System.out.println("pc at BubbleSort");
    }
}
