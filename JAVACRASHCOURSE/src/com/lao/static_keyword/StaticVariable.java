package com.lao.static_keyword;

public class StaticVariable {
	
	static int accountbalance;
	 String depositedby;
	
// example for static variable, static variable are shared among (last) object
// static variable is common for all static variable
	
	public static void main(String[] args) {
		
		StaticVariable object1=new StaticVariable();
		object1.accountbalance=1000;
		object1.depositedby="agni";
	
		StaticVariable object2=new StaticVariable();
		object2.accountbalance=2000;
		object2.depositedby="riya";
		
		System.out.println("object integer:"+ object1.accountbalance);
		System.out.println("object String:"+ object1.depositedby);
		
		System.out.println("object integer:"+ object2.accountbalance);
		System.out.println("object String:"+ object2.depositedby);

	}

}
