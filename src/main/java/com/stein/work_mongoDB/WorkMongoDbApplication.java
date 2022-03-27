package com.stein.work_mongoDB;

import com.stein.work_mongoDB.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkMongoDbApplication.class, args);
	}

	User user1 = new User("19","stein","igorxdev@gmail.com");
	User user2 = new User();

	String email = user1.getEmail();
}
