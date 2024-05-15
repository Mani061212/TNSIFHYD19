package com.si.sample;

public class Sample {
       int a = 10;
       static int b = 20;
       
       void display() {
         System.out.println("mani");  
       }
       
        static String display1() {
        	return "mani";
        }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample();
		System.out.println(s1.a);
		s1.display();
		System.out.println(Sample.b);
		Sample.display1();
	}

}
