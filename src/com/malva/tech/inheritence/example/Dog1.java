package com.malva.tech.inheritence.example;



class Animal1{
	
	Animal1(){
		System.out.println("it's Animal");
	}
	
}

public class Dog1 extends Animal1 {
	
	Dog1(){
		//super();
		System.out.println("its Dog");
	}
	
	private void eat(){
		System.out.println("do is eating.....");
	}

	public static void main(String[] args) {
		Dog1 d = new Dog1();
       d.eat();
	}

}
