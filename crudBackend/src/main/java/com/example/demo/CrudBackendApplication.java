package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		userRepository.save(new User("Hem Chand","Hukumathirao"));
		userRepository.save(new User("Kamalamma","Hukumathirao"));
		userRepository.save(new User("Venkateswara Rao","Hukumathirao"));
		userRepository.save(new User("Bhargavi","Hukumathirao"));
		userRepository.save(new User("Aparna","Hukumathirao"));

		
	}
}
