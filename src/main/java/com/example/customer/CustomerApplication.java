package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {
    public void demo(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
