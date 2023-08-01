package com.malva.tech.inheritence.example;

public class ExampleOfMethodOverloading {
	
	int firstNumber = 20;
	int secondNumber = 30;
	
	public int addNumber(int a, int b){
		return a+b;
		
	}
	
	public int addNumber(int a, int b,int c,int d){
		return a+b+c+d;
		
	}
	
	

	public static void main(String[] args) {
		ExampleOfMethodOverloading e = new ExampleOfMethodOverloading();
		int x = e.addNumber(e.firstNumber,e.secondNumber);
		System.out.println("my result " + x);
		System.out.println(e.addNumber(2, 7, 8, 10));
		
	}
	
	
}
