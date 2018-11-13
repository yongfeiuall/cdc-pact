package com.izheyi.pact_provider;

import java.util.Random;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
	
	@RequestMapping("/person/{name}")
	public ProviderModel person(@PathVariable String name){
		int age = new Random().nextInt(6);
		
		return new ProviderModel(name, age);
	}
}
