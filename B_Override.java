package com.si.sample;

public class B_Override extends A_Override {
	
    int b = 20;
    
    // override method 2
	
	public void display() {
		
		System.out.println("class B " + b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		A_Override b1 = new B_Override(); // object creation for extended classes 
		
		b1.display();  // calling method 
		
	}

}
