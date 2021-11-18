package com.krishna;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.krishna.entity.User;
import com.krishna.enums.GENDER;
import com.krishna.repository.UserRepository;

@SpringBootApplication
public class SpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepository userRepository) {

		return args -> {

			User user1 = User.builder().name("AJAY").gender(GENDER.MALE).age(24).build();
			User user2 = User.builder().name("Bhavana").gender(GENDER.FEMALE).age(22).build();
			User user3 = User.builder().name("Chandra").gender(GENDER.MALE).age(26).build();
			User user4 = User.builder().name("Dinesh").gender(GENDER.MALE).age(28).build();
			userRepository.saveAll(Arrays.asList(user1, user2, user3, user4));
		};
	}

}
