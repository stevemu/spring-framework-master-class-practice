package com.example.springtest.myTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BinarySearch {
    @Autowired
    Sort sort;

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @PostConstruct
    public void pc() {
        System.out.println("pc at BinarySearch");
    }
}
