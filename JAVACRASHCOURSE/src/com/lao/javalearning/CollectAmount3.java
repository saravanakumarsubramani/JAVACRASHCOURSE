package com.lao.javalearning;

public class CollectAmount3 {
	
	public Integer collectedAmount=1000;
	
	public Integer collectAmountAndGiveitToMe() {
		System.out.println("DADDY HAVE COLLECTED RUPEES " + collectedAmount + " and sent it to you");
		return collectedAmount; 
	}

	public static void main(String[] args) {
		// return types
		
		CollectAmount3 myson=new CollectAmount3();
		Integer amount=myson.collectAmountAndGiveitToMe();
		System.out.println("GOT THE AMOUNT SON "+ amount);
		
	}

}



		
		
	