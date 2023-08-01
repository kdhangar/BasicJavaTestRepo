package com.malva.tech.inheritence.example;

 class Bike {
	
	
	public void  bikeStart(){
		System.out.println("Bike is started Parent");
	}
	
	public int bikeSpeed(){
		return 60;
		
	}

}

public class Hoda extends Bike {
	
	
	public static void main(String[] args) {
		System.out.println("we are  in side hoda class");
	
		Hoda h1  = new Hoda();
		h1.bikeStart();
		System.out.println(h1.bikeSpeed() +  " KM");
	
	
	}
	
	public int bikeSpeed(){
		return 120;
		
	}
	
	public void  bikeStart(){
		System.out.println("Bike is started HondaBike");
	}
	
}