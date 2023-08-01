package com.malva.tech.abstractone.example;

interface Printable{
	void print();
	//1.8
	default void test(){
		System.out.println("it's default");
	}
}

interface Shop{
	void shop();
	void print();
	//1.8
	 static void tester(){
		System.out.println("are you tester..as static");
	}

}


public class TestInterface implements Printable,Shop   {

	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		t.print();
		t.shop();
		t.test();
		Shop.tester();
	}

	@Override
	public void shop() {
		System.out.println("are you insight the shop");
	}

	@Override
	public void print() {
		System.out.println("it's print method");
	}

}
