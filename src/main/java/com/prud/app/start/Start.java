package com.prud.app.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = { "com.prud.config", "com.prud.service", "com.prud.translator", "com.prud.mapper.impl",
		"com.prud.model.middleware" })
@PropertySource("classpath:epos-to-client-mapping.properties")
public class Start {

	public static void main(String[] args) {
		System.out.println("startup of Application");
		SpringApplication.run(Start.class, args);
	}
}
