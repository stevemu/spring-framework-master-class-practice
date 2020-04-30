package com.example.xmljdbcconnection.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    private PersonService personService;

    public void test() {
        PersonService.Person[] persons = personService.getAll();
        System.out.println(persons);
    }
}
