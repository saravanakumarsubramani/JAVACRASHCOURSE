package com.lao.constructor;

public class NoargEmployee {
	
	int employeeid;
	String employeename;
	
	// example for a No arg constructor is defines as class name and constructor name is must same
	
	NoargEmployee(){
		employeeid=1;
		employeename="Agni";
		System.out.println("Employee object is created ");
	}

	public static void main(String[] args) {
		
		NoargEmployee employee=new NoargEmployee();
		System.out.println(employee.employeeid);
		System.out.println(employee.employeename);
	}
}
