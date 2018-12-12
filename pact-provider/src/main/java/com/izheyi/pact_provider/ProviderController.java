package com.izheyi.pact_provider;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izheyi.pact_provider.ProviderService;

@RestController
public class ProviderController {
	
	@Autowired
	ProviderService providerService;
	
	@RequestMapping("/person/{name}")
	public ProviderModel person(@PathVariable String name){
		int age = new Random().nextInt(6);
		
		return new ProviderModel(name, age);
	}
	
	@RequestMapping("/user")
	public ProviderModel getUser(){
//		providerService.addUser("1", "hulu", 5);
		return providerService.getUser();
	}
}

