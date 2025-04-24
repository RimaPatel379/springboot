package com.springboot.HelloWorld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Override Run method from CommandLineRunner Interface");
	}

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);
	}


}
