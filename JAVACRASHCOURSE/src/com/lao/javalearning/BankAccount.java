package com.lao.javalearning;

public class BankAccount {
	
	Long accountnumber=1234567890l;
	
	String holdername="Agni";
	
	Integer accountbalance=350;
	
	public void getbalance() {
	System.out.println("Balance is "+ accountbalance);
	}
	public static void main(String[] args) {
		// classname objname=new classname();
		BankAccount account=new BankAccount();
		account.getbalance();
		
	
		
	}

}
