package com.example.database;

import com.example.database.entity.Person;
import com.example.database.jpa.PersonJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaApp implements CommandLineRunner {

//	private Logger logger = LoggerFactory.getLogger(this.getClass());

//	@Autowired
//	PersonJdbcDao dao;

	@Autowired
	PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(personJpaRepository.findById(1001));
//		personJpaRepository.insert(new Person("Majda3", "braintree", new Date()));
//		System.out.println(personJpaRepository.update(new Person(1001, "naima", "quincy", new Date())));
//		personJpaRepository.deleteById(1001);
		System.out.println(personJpaRepository.findAll());
	}
}
