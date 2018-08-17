package com.af.prud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = { "com.af.prud.config", "com.af.prud.service", "com.af.prud.controller",
		"com.af.prud.translator","com.af.prud.mapper.epostoil" })
@PropertySource("classpath:epos-to-client-mapping.properties")
public class Start {

	public static void main(String[] args) {
		System.out.println("startup of Application");
		SpringApplication.run(Start.class, args);
	}
}
