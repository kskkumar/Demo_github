package com.demo;

public class GreetAction {
	private String message;
	public String execute()
	{ message="welcome structs";
		return "sucess";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
