package com.si.sample;

import gateaspirants.*;  // package imported

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pre_final_year p1 = new Pre_final_year(); // Pre_final_year class object
        
        Final_year f1 = new Final_year();  // final_year class object
        
        Droppers D1 = new Droppers();   // Droppers class object
        
        // calling methods
        
        p1.attempt();
        p1.hours();
        p1.subjects(); 
        
        f1.attempt();
        f1.hours();
        f1.subjects();
        
        D1.attempt();
        D1.hours();
        D1.subjects();
        
	}

}
