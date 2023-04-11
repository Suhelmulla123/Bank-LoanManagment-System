 package com.system.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;

@SpringBootApplication(exclude=ReactiveSecurityAutoConfiguration.class)
public class BankLoanManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankLoanManagmentSystemApplication.class, args);
	}

}
