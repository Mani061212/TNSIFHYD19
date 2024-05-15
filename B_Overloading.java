package com.si.sample;

public class B_Overloading { 
	
	int a = 10;
    static int b = 30;
    
    void display() {
      System.out.println("mani" + a);  
    }
    
     static String print() {
    	
    	 System.out.println(b);
    	 return "mani";
     	
     }
    
    void display(int a) {
      System.out.println("mani" + a);  
    }
    
     static String print(int b) {
    	
    	 System.out.println(b);
    	 return "mani";
     	
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        B_Overloading b1 = new B_Overloading(); // object creation for extended classes 
		
		b1.display();  // calling instance method 
		b1.display(20); 
		
	    System.out.println(B_Overloading.print());   // calling static methods
	    System.out.println(B_Overloading.print(40));
	}

}
