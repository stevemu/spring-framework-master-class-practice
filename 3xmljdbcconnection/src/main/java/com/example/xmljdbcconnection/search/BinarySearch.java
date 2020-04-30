package com.example.xmljdbcconnection.search;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BinarySearch {
    private BubbleSort bubbleSort;

    public BubbleSort getBubbleSort() {
        return bubbleSort;
    }

    public void setBubbleSort(BubbleSort bubbleSort) {
        this.bubbleSort = bubbleSort;
    }
}
