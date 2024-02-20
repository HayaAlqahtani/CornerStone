package com.coded.NursesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class })
public class NursesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NursesAppApplication.class, args);
	}

}
