package com.izheyi.pact_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class ProviderApp {

	public static void main(String[] args) throws Exception {
	SpringApplication.run(ProviderApp.class, args);
	}
}