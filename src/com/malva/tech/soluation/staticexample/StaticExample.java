package com.malva.tech.soluation.staticexample;

public class StaticExample {
	
    int rollNumber;
	String stdName;
	static String collageName = "GOVT PG Mandsour";
	
	
	StaticExample( int id, String name){
		rollNumber = id;
		stdName = name;
		//collageName = c;
		
	}
	
	
	public static void main(String[] args) {
		
		StaticExample S = new StaticExample(101,"Ravi");
		StaticExample S1 = new StaticExample(102,"Ravi");
		
		System.out.println(S.rollNumber +" "+S.stdName +" "+ collageName);
		System.out.println(S1.rollNumber +" "+S1.stdName +" "+ collageName);
	}

}
