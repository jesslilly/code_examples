package com.jesslilly.junit_param_test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

// See http://techinsides.blogspot.com/2010/08/dont-repeat-yourself-junit-4s.html
@RunWith(Parameterized.class)
public class SimpleGreetingParamTest {

	private static SimpleGreetingTestData testData;
	private static SimpleGreeting testObject;

	public SimpleGreetingParamTest(SimpleGreetingTestData testData) {
		super();
		SimpleGreetingParamTest.testData = testData;
	}

	@Before
	public void setUp() throws Exception {
		testObject = testData.getTestObject();
	}

	@Parameters
	public static Collection<Object[]> createInputValues() throws Exception {
		return SimpleGreetingTestData.getTestData();
	}

	@Test
	public void testGetName() {
		assertEquals(testData.getName(), testObject.getName());
	}

	@Test
	public void testSayHello() {
		assertTrue(testObject.sayHello().matches(testData.sayHello()));
	}
}
