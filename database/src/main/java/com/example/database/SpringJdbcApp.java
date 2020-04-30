package com.example.database;

import com.example.database.jdbc.PersonJdbcDao;
import com.example.database.jpa.PersonJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcApp implements CommandLineRunner {

//	private Logger logger = LoggerFactory.getLogger(this.getClass());

//	@Autowired
//	PersonJdbcDao dao;

//	@Autowired
//	PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println();
//		logger.info("all users {}", dao.findAll());

//		System.out.println(dao.findAll());
//		System.out.println(dao.findById(1001));
//		System.out.println(dao.findByName("majda"));
//		System.out.println(dao.findByNameContains("majda"));
//		System.out.println(dao.deleteById(1001));
//		dao.insert(new Person(1004, "madja2", "braintree", new Date()));
//		dao.update(new Person(1004, "majda3", "quincy", new Date()));
	}
}
