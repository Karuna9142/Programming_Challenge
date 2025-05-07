package com.string;

class DiceRoll {
	
	int roll() {
		double random = Math.random() * 6;
		return (int) Math.ceil(random);
	}

	public static void main(String[] args) {
		DiceRoll d1 = new DiceRoll();
		d1.roll();
		
		for(int i = 0; i< 10; i++) {
			System.out.println(d1.roll());
		}

	}

}
