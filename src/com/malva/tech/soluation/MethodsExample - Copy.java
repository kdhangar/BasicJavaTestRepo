package com.malva.tech.soluation;

public class MethodsExample {

	public static void main(String[] args) {
		
		System.out.println("This is Main Method");
		System.out.println("this is a addNumberResult " +addNumber(88,40));
		//object 
		MethodsExample m1 = new MethodsExample();
		System.out.println(m1.mulNumber(3,4));
	}
	
	
	public static int addNumber(int x,int y){
		
		return x+y;
	}
	
	public int mulNumber(int a,int b){
		return a*b;
	}
     
	/*public MethodsExample(){
		System.out.println("Hello default");
	}*/
	
}
