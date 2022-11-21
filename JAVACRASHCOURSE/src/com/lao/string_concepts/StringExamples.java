package com.lao.string_concepts;

public class StringExamples {
	
	//example for string.string is sequence of characters

	public static void main(String[] args) {
		// here we see the list if string methods
		
		String name="Agniprasath"; // this string literal type
		int number=3564;
		
		// char returns the character values for the particular index 0,1,2,3...
		System.out.println(name.charAt(1));
		
		//returns string length
		System.out.println(name.length());
		
		//checks the equality of string with the given object using boolean method
		System.out.println(name.equals("arul"));
		
		//checks the equality of string with the given string object 
		//without case sensitivity but content is same 
		System.out.println(name.equalsIgnoreCase("AGNIPRASATH"));
		
		//CHECKS IF STRING IS EMPTY OR NOT 
		System.out.println(name.isEmpty());
		
		//returns the true or false based on the given value is present or not
		System.out.println(name.contains("A"));
		
		//TAKE A PARTICULAR PORTION OF THE STRING (CROP)
		System.out.println(name.substring(1));
		
		//take a particular portion of the string begin and end index
		System.out.println(name.substring(1, 3));
		
		// joins the string to the given string
		System.out.println(name.concat("arulprasath"));
		
		//replaces the existing char with given char
		System.out.println(name.replace("g", "G"));
		System.out.println(name.replace("Agni", "riya"));
		
		//FIND THE POSITION OF A CHARACTER IN THE STRING
		System.out.println(name.indexOf("A"));
		
		//find the character specified from the index position
		System.out.println(name.indexOf("a", 7));
		System.out.println(name.indexOf("i", 2));
		System.out.println(name.indexOf("sath", 1));
		
		//trim will remove the white spaces before and after
		System.out.println(name.trim());
		
		//convert the given datatype to string
		System.out.println(String.valueOf(number));
		
		// converts uppercase to lowercase
		String UpperCase="RIYAPRSANTH";
		System.out.println(UpperCase.toLowerCase());
		
		//converts lowercase to uppercase
		String LowerCase="aishwaryaprasath";
		System.out.println(LowerCase.toUpperCase());
		
		//returns the joined string with given delimiter
		System.out.println(String.join("-","learn","automation","online"));
		System.out.println(String.join("/", "01","06","2022"));
		
		//split
		String splitThis="am,i,teaching,good?";
		String[] splittedwords=splitThis.split(",");
		for (String string:splittedwords) {
			System.out.println(string);
		}
	}
}
