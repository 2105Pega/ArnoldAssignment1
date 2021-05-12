package com.maven1.definitions;

public class Definitions {
	
	private String statementOfIntent;
	private String somethingNice;
	
	//You can use these to different class types (a car with 4 wheels, a trycicle with 3)
	public Definitions() {
		this.statementOfIntent = "We would just like to say";
		this.somethingNice = " we have a great instructor!";
	}
	
	public void saySomething() {
		System.out.println(statementOfIntent + somethingNice);
	}
	

}

	

