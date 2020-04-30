package com.example.database;

import com.example.database.entity.Person;
import com.example.database.jpa.PersonJpaRepository;
import com.example.database.springdata.PersonSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataApp implements CommandLineRunner {

	@Autowired
	PersonSpringDataRepository personSpringDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(personJpaRepository.findById(1001));
		personSpringDataRepository.save(new Person("Majda99", "braintree", new Date()));
//		personSpringDataRepository.dele
//		System.out.println(personSpringDataRepository.save(new Person(1002, "majda100", "quincy", new Date())));
//		personJpaRepository.deleteById(1001);
//		System.out.println(personSpringDataRepository.findAll());
//		System.out.println(personSpringDataRepository.findById(1001));
	}
}
