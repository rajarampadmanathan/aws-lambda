package com.prajaram.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class Hello implements RequestHandler<TestRequest, String> {
	public String handleRequest(TestRequest name, Context context) {
		return "Hello ...."+ name.getName() +" !!! Welcome to lambda World";
	}
}

class TestRequest{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
