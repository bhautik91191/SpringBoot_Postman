package com.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringBootPostmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostmanApplication.class, args);
	}

}
