package com.covid.info.covidinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories
public class CovidinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidinfoApplication.class, args);
	}

}
