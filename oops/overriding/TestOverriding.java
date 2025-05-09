package com.oops.overriding;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}
class ICICI extends Bank {
	int getRateOfInterest() {
		return 6;
	}
}
class AXIS extends Bank {
	int getRateOfInterest() {
		return 10;
	}
}
public class TestOverriding {

	public static void main(String[] args) {
		
		SBI s1 = new SBI();
		ICICI c1 = new ICICI();
		AXIS a1 = new AXIS();
		
		System.out.println("SBI rate of interest:- "+s1.getRateOfInterest());
		System.out.println("ICICI rate of interest:- "+c1.getRateOfInterest());
		System.out.println("AXIS rate of interest:- "+a1.getRateOfInterest());
	}

}
