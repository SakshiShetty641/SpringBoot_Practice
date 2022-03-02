package com.thoughtworks.com.PracticeProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//getbean - tell the spring container we need the object of the customers class


@SpringBootApplication
public class PracticeProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PracticeProjectApplication.class, args);
		Customers c = context.getBean(Customers.class);
		c.display();
	}

}
