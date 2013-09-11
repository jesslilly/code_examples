package com.jesslilly.junit_param_test;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleGreetingTestData implements Greeting {
	private SimpleGreeting testObject;
	private String name;
	private String hello;

	public SimpleGreetingTestData(SimpleGreeting testObject, String name, String hello) {
		super();
		this.testObject = testObject;
		this.name = name;
		this.hello = hello;
	}

	public SimpleGreeting getTestObject() {
		return testObject;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return hello;
	}

	public static Collection<Object[]> getTestData() throws Exception {
		ArrayList<Object[]> input = new ArrayList<Object[]>(3);

		input.add(new Object[] { new SimpleGreetingTestData(new SimpleGreeting(
				"jess"), "Jess", "Hello.*Jess.*" ) });
		input.add(new Object[] { new SimpleGreetingTestData(new SimpleGreeting(
				"AMIR"), "Amir", "Hello.*Amir.*" ) });
		input.add(new Object[] { new SimpleGreetingTestData(new SimpleGreeting(
				"Z"), "Z", "Hello.*Z.*" ) });
		//input.add(new Object[] { new SimpleGreetingTestData(new SimpleGreeting(
		//		""), "", "Hello.*" ) });
		return input;
	}

}