package com.malva.tech.inheritence.example;


class A{
	A(){
		System.out.println("animal is created ...");
	}
}

class D extends A {
	D(){
		//super();
		System.out.println("Dog is created....");
	}
}
public class TestSuper1 {

	public static void main(String[] args) {
    D d = new D();
		
	}

}
