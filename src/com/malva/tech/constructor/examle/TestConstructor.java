package com.malva.tech.constructor.examle;

public class TestConstructor {
	
	String nameOfEmp;
	String empID;
	String companyName;
	
	TestConstructor(){
	
	}
	
	TestConstructor(String empID,String nameOfEmp){
		this.empID = empID;
		this.nameOfEmp = nameOfEmp;
	}
	
	TestConstructor(String empID,String nameOfEmp,String companyName){
		this.empID = empID;
		this.nameOfEmp = nameOfEmp;
		this.companyName = companyName;
	}

	public static void main(String[] args) {
	
		TestConstructor t1 =  new TestConstructor("101","Devika");
		//t1.nameOfEmp = "jitendar";
		
		
		System.out.println(t1.empID + " "+t1.nameOfEmp);
		TestConstructor t2 =  new TestConstructor("102","Ravi","TCS");
        System.out.println(t2.empID + " "+ t2.nameOfEmp +" "+t2.companyName);
		
	}

}
