package com.lao.conditional_statements;

public class WhostheHero {
	
	String myheroName="captain america";
	
	public void superHeroGusser() {
		//if else if  condition example
		//two methods is equals and equalsignorecase
		
		if(myheroName.equals("iron man")) {
			System.out.println("you thought about iron man");
		}
		else if(myheroName.equalsIgnoreCase("captain america")) {
			System.out.println("you thought about captain america ");
		}
		else if(myheroName.equals("thor")) {
			System.out.println("you thought about thor");
	}
		else {
			System.out.println("sorry i cant guess");
		}

	}
	public static void main(String[] args) {
		//class name object name=new classname();
		//object name.returntype();
		WhostheHero hero=new WhostheHero();
		hero.superHeroGusser();

	}

}
