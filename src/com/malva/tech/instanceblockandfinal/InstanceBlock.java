package com.malva.tech.instanceblockandfinal;

public class InstanceBlock {
	
	final String name;
	
	 InstanceBlock(){
		
		System.out.println("Constractore is created");
	}
 
	{name ="kailash"; 
	System.out.println(name);}
	
	public final void displayuser(){
		System.out.println("there are two much user");
	}
	
	public static void main(String[] args) {
		InstanceBlock	p1 = new InstanceBlock();
		
	}

}
