package com.izheyi.pact_provider;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import au.com.dius.pact.provider.junit.RestPactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.VerificationReports;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.spring.target.MockMvcTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(RestPactRunner.class) // Say JUnit to run tests with custom Runner
@Provider("test_provider") // Set up name of tested provider
@PactFolder("../pact-consumer/target/pacts") // Point where to find pacts (See also section Pacts source in documentation)
@VerificationReports({"console", "markdown"})
public class VerifyState {
	
	@Mock
	private ProviderService providerService;
	
	@InjectMocks
	private ProviderController providerController = new ProviderController();
	
	 @Before //Method will be run before each test of interaction
	 public void before() {
	     //initialize your mocks using your mocking framework
		 MockitoAnnotations.initMocks(this);
	
		 //configure the MockMvcTarget with your controller and controller advice
	     target.setControllers(providerController);
	 }
	
	@State("user 1 exist")
	public void addUser(){
		when(providerService.getUser())
		.thenReturn(new ProviderModel("1", "tanghulu", 5));
		
	}

    @TestTarget // Annotation denotes Target that will be used for tests
    public final MockMvcTarget  target = new MockMvcTarget(); // Out-of-the-box implementation of Target (for more information take a look at Test Target section)

}
