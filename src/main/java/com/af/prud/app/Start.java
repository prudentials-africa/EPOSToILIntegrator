package com.af.prud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.af.prud.config", "com.af.prud.service", "com.af.prud.controller",
		"com.af.prud.translator" })
public class Start {

	public static void main(String[] args) {
		System.out.println("startup of Application");
		SpringApplication.run(Start.class, args);
	}
}
