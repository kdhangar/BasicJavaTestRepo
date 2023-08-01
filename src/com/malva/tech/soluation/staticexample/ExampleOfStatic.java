package com.malva.tech.soluation.staticexample;

public class ExampleOfStatic {

static int count = 0;
	
	
	ExampleOfStatic(){
		count++;
		System.out.println(count);
	}	
	
	public static void main(String[] args) {
		ExampleOfStatic e = new ExampleOfStatic();
		ExampleOfStatic e1 = new ExampleOfStatic();
		ExampleOfStatic e2 = new ExampleOfStatic();
		ExampleOfStatic e3 = new ExampleOfStatic();
		ExampleOfStatic e4 = new ExampleOfStatic();
		
		
	}

}
