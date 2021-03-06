package com.izheyi.pact_consumer;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.PactProviderRuleMk2;
import au.com.dius.pact.consumer.PactVerification;
import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;

public class ConsumerTest {
	
	@Rule
    public PactProviderRuleMk2 mockProvider = new PactProviderRuleMk2("test_provider", "localhost", 8080, this);
	
	@Pact(provider="test_provider", consumer="test_consumer")
	public RequestResponsePact getPersonAge(PactDslWithProvider builder) {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		
		DslPart resbody = new PactDslJsonBody()
				.stringType("name", "zhangsan")
				.integerType("age", 4)
				.asBody();
		
		return builder
				.uponReceiving("A request for age for person zhangsan")
				.path("/person/zhangsan")
				.method("GET")
				.willRespondWith()
				.status(200)
				.headers(headers)
				.body(resbody)
				.toPact();		
	}
	
	@Pact(provider="test_provider", consumer="test_consumer")
	public RequestResponsePact getUser(PactDslWithProvider builder) {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		
		DslPart resbody = new PactDslJsonBody()
				.stringType("id", "1")
				.stringType("name", "tanghulu")
				.integerType("age", 4)
				.asBody();
		
		return builder
				.given("user 1 exist")
				.uponReceiving("A request go get user 1")
				.path("/user")
				.method("GET")
				.willRespondWith()
				.status(200)
				.headers(headers)
				.body(resbody)
				.toPact();		
	}
	
	@Test
	@PactVerification(value="test_provider", fragment="getPersonAge")
	public void doTest(){
		Integer age = new GetPersonAge(mockProvider.getUrl()).checkAge("zhangsan");
		System.out.println("Test result, age = " + age);
		assertTrue(age <= 6);
	}
	
	@Test
	@PactVerification(fragment="getUser")
	public void getUser(){
		String user = new GetUser(mockProvider.getUrl()).getUser();
		System.out.println("Test result, user: " + user);
		assertTrue(user.contains("tanghulu" ));
	}
}
