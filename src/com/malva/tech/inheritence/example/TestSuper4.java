package com.malva.tech.inheritence.example;

class Person {
	int id;
	String name;
	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}

 class Emp extends Person{

	 float salary;
	 
	Emp(int id, String name,float salary) {
		super(id, name);
		this.salary = salary;
	}
	 
	public void display(){
		System.out.println(id +" "+ name + " "+ salary);
	}
 }

public class TestSuper4 {

	public static void main(String[] args) {
    
		Emp e = new Emp(101,"Karishna",2000.00f);
		Emp e1 = new Emp(102,"Umesh",3000.00f);
		e.display();
		e1.display();
	}

}
