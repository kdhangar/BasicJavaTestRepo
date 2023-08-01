package com.malva.tech.method.overriding;

 class RieservBank {
	 int getRateOfInterest() {
		return 5;
	}
}

// Creating child classes.
class SBI extends RieservBank {
	/*int getRateOfInterest() {
		return 8;
	}*/
}

class ICICI extends RieservBank {
	/*int getRateOfInterest() {
		return 7;
	}*/
}

class AXIS extends RieservBank {
	/*int getRateOfInterest() {
		return 9;
	}*/
}

class Sositiy extends RieservBank {
	int getRateOfInterest(int c) {
		return 12;
	}
}

// Test class to create objects and call the methods
class Test2 {
	public static void main(String args[]) {
		RieservBank s = new SBI();
		RieservBank i = new ICICI();
		RieservBank a = new AXIS();
		Sositiy s1 = new Sositiy();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest() + "%");
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest() + "%");
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest() + "%");
		System.out.println("Socity Rate of Interest: " + s1.getRateOfInterest(1) + "%");
	}
}
