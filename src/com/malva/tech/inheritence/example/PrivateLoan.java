package com.malva.tech.inheritence.example;



class Hdfc{
	public float rateOfIntarce(){
		return 9.5f;
	}
}

//super class, parent class
class Sbi extends Hdfc{
	
	public float rateOfIntarce(){
		return 10.5f;
	}
	
}

//sub class drived class, child class,
public class PrivateLoan extends Sbi {

	//main method
	
	public static void main(String[] args){
        
		//object creation
		Sbi s1  = new PrivateLoan();
		System.out.println(s1.rateOfIntarce() + " Private Bank RateOfIntrace");
	
	}
	
	
	//@override
	public float rateOfIntarce(){
		return 18.5f;
	}

}
