package com.covidtracker.coviddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableFeignClients
public class CoviddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoviddemoApplication.class, args);
	}

}
