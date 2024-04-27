package com.example.JA_USER_INFO_HTTP.sita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.JA_USER_INFO_HTTP.sita" })
public class SitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SitaApplication.class, args);
	}

}
