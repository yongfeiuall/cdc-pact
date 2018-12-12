package com.izheyi.pact_provider;

import org.springframework.stereotype.Service;
import com.izheyi.pact_provider.ProviderModel;

@Service
public class ProviderService {
	
	ProviderModel providerModel = new ProviderModel();
	
	public ProviderModel getUser(){
		return providerModel;
	}
	
//	public ProviderModel addUser(String id, String name, Integer age){
//		providerModel.setId(id);
//		providerModel.setName(name);
//		providerModel.setAge(age);
//		System.out.println("yongfei=============");
//		return providerModel;
//	}

}

