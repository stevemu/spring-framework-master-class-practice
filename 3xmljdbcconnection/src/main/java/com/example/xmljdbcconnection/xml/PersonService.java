package com.example.xmljdbcconnection.xml;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public Person[] getAll() {
        Person person1 = new Person();
        person1.setAge(31);
        person1.setName("qi");
        Person[] persons = new Person[]{person1};
        return persons;
    }
}
