package com.malva.tech.aggrigaton.example;


  class Address{
	String cityName = "Indore";
	String countryName = "India";
	String villageName = "VijayNagar";
	int houseNo = 38;
	
	public void display(){
		System.out.println(cityName + " " +countryName + " " +villageName + " "+ houseNo);
	}
}

public class Employees {

	String nameOfEmp = "Retiesh Deshmukha";
	int empID = 201;
	Address address;
	
	public void empInfo(){
		System.out.println(empID +" "+ nameOfEmp);
		address =new Address();
		address.display();
	}
	
	public static void main(String[] args) {
		Employees e = new Employees();
		e.empInfo();
	}

}
