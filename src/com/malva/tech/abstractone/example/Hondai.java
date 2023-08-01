package com.malva.tech.abstractone.example;

abstract class Car implements TestingTool{
	
	abstract void oilBreak();
	abstract void excilater();
	
	public void display(){
		System.out.println("it's runing car");
	}
	
}


public class Hondai extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hondai h = new Hondai();
		h.excilater();
		h.oilBreak();
		h.display();
		System.out.println(h.id);
		System.out.println(TestingTool.id);

	}

	@Override
	void oilBreak() {
      System.out.println("hondai break is working....");		
	}

	@Override
	void excilater() {
     System.out.println("max limit of excilater 240....");		
	}

}
