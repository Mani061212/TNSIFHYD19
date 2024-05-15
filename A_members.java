package com.si.sample;

public class A_members {
	
	int a = 10;         //instance variable
	static int b = 20;  //static variable
	
	public void display() {
		
		 System.out.println(a);  //Accessing instance variable
		 System.out.println(b);  //Accessing static variable
	}
	
	public static void print() {
		
	    //Accessing instance variable getting error
		System.out.println(b);  //Accessing static variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A_members a1 = new A_members(); // creating object for class
         
         a1.display(); // calling instance display method
         
         A_members.print(); // calling static print method
	}

}
