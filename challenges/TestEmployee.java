package com.challenges;



class TestEmployee {

	public static void main(String[] args) {
		
		Employees e1 = new Employees("karuna",30, 35000);
        System.out.println(e1.getEmployeeDetails());
        e1.setName("Monu");
        e1.setAge(25);
        
        System.out.println(e1.getEmployeeDetails());
        
        
	}

}
