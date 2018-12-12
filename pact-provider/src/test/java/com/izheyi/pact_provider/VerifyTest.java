package com.izheyi.pact_provider;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.VerificationReports;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.HttpTarget;

//@RunWith(PactRunner.class) // Say JUnit to run tests with custom Runner
//@Provider("test_provider") // Set up name of tested provider
//@PactFolder("../pact-consumer/target/pacts") // Point where to find pacts (See also section Pacts source in documentation)
//@VerificationReports({"console", "markdown"})
//public class VerifyTest {
//
//    @TestTarget // Annotation denotes Target that will be used for tests
//    public final Target target = new HttpTarget(8080); // Out-of-the-box implementation of Target (for more information take a look at Test Target section)
//
//}

//@RunWith(PactRunner.class) // Say JUnit to run tests with custom Runner
//@Provider("test_provider") // Set up name of tested provider
//@PactBroker(host = "192.168.220.139", port = "80")
//@VerificationReports({"console", "markdown"})
//public class VerifyTest {
//	
//	@BeforeClass //Method will be run once: before whole contract test suite
//    public static void setUpService() {
//		System.setProperty("pact.provider.version", "0.0.1-SNAPSHOT ");
//		System.setProperty("pact.verifier.publishResults", "true");
//    }
//	
//	
//    @TestTarget // Annotation denotes Target that will be used for tests
//    public final Target target = new HttpTarget(8080); // Out-of-the-box implementation of Target (for more information take a look at Test Target section)
//
//}

//@RunWith(PactRunner.class) // Say JUnit to run tests with custom Runner
//@Provider("test_provider") // Set up name of tested provider
//@PactBroker(host = "192.168.220.139", port = "80")
//@VerificationReports({"console", "markdown"})
//public class VerifyTest {
//	
//	@BeforeClass //Method will be run once: before whole contract test suite
//    public static void setUpService() {
//		System.setProperty("pact.provider.version", "0.0.1-SNAPSHOT ");
//		System.setProperty("pact.verifier.publishResults", "true");
//    }
//	
//	
//    @TestTarget // Annotation denotes Target that will be used for tests
//    public final Target target = new HttpTarget(8080); // Out-of-the-box implementation of Target (for more information take a look at Test Target section)
//
//}
