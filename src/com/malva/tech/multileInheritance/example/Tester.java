package com.malva.tech.multileInheritance.example;
//Example of Hieracyle inhertence
//Parent class
 class Animal{
	public void eat(){
		System.out.println("eating.......");
	}
	public void weap(){
		System.out.println("weaping hiiii....");
	}
}
//child class
class Dog extends Animal{
	public void brak(){
		System.out.println("broking....");  
	}
	
	public void eat(){
		System.out.println("eating dog.......");
	}
}
//child class
class BabyDog extends Animal {
	public void weap(){
		System.out.println("weaping....");
	}
	public void eat(){
		System.out.println("eating Babydog.......");
	}
}

public class Tester {

	public static void main(String[] args) {
		Animal bd = new BabyDog();
		Dog d = new Dog();
		bd.weap();
		//bd.brak();
		bd.eat();
		d.brak();
		d.eat();
		
	}

}
