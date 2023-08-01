package com.malva.tech.inheritence.example;

class Employ{
	
	float salary;
	//Constractar
	Employ(){
		this.salary = 10000; }
	
	}
class Programmer extends Employ{
	float bonus;
	Programmer(){
		this.bonus = 5000;}
	
}

public class ProgrammerEmployee {
	
	public static void main(String[] args) {	
		
     Programmer P1= new Programmer();
     ProgrammerEmployee p2 = new ProgrammerEmployee();
 
 float totalSalary = p2.totalSalary(P1.salary ,P1.bonus);


System.out.println("total salary for you programmer:: " + totalSalary);

	}
	
 public float   totalSalary(float basicSalary, float bonus) {
	return basicSalary + bonus;
 }
}

