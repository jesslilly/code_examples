package com.jesslilly.junit_param_test;

public class SimpleGreeting implements Greeting {

	private String name;

	public SimpleGreeting(String name) {
		super();
		// There is a bug here on purpose (name = 1 char)
		this.name = name.substring(0, 1).toUpperCase()
				+ name.substring(1, name.length()).toLowerCase();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String sayHello() {
		return "Hello, " + name + "! How are you today?";
	}

}
