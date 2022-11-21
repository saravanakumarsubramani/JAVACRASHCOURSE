package com.lao.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
// Example for ARRAYLIST

public class ArrayListExample {
	
	public void arraylistexample(){
		
		List<String> arrayList=new ArrayList<String>();
		//parent class <DATATYPE> ref =new childclass<DATATYPE>();
		arrayList.add("BENZ");
		arrayList.add("bmw");
		arrayList.add("bugati");
		arrayList.add("bentely");
		arrayList.add("bentely");
		
		System.out.println(arrayList);
		
		//GET THE INDEX OF VALUES IN STRINGS
		System.out.println(arrayList.get(0));
		
		//GET THE INDEX OF  STRING IN VALUES
		System.out.println(arrayList.indexOf("bentely"));
		
		//GET THE INDEX OF LAST STRING IN VALUES
		System.out.println(arrayList.lastIndexOf("bentely"));
		
		//IF THE LIST NAME IS NOT THERE, GET THE INDEX OF VALUES -1 
		System.out.println(arrayList.indexOf("MARUTHI"));
		
		// get the arraylist values into anotherlist
		List<String> anotherlist=new ArrayList<String>();
		anotherlist.addAll(arrayList);
		
		System.out.println(anotherlist);
		
		//clear is used to clear the arraylist values
		anotherlist.clear();
		System.out.println(anotherlist);
		
		//remove is used to remove the index values of arraylist
		arrayList.remove(0);
		System.out.println(arrayList);
		
		//remove is also used to remove the string of index values
		arrayList.remove("bugati");
		System.out.println(arrayList);
		
		//adding null in arraylist
		arrayList.add(null);
		System.out.println(arrayList);
		
		//set method is used to update the index values in arraylist
		arrayList.set(0, "chevtolet");
		System.out.println(arrayList);
		
		//Isempty method is give statement is true or false
		System.out.println(arrayList.isEmpty());
		
		//Iterate
		//using for each 
		for (String string :arrayList) {
			System.out.println("using for each"+ string);
		}
		System.out.println("-----------------------------");
		//using for loop
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println("using for loop"+ arrayList.get(i));
			
		}
		System.out.println("-----------------------------");
		
		
		//while for list_iterator next
		ListIterator <String> list_iterator= arrayList.listIterator();
		while(list_iterator.hasNext()) {
			System.out.println(list_iterator.next());
		}
		System.out.println("-----------------------------------------");
		
		//while for list_iterator previous
		while(list_iterator.hasPrevious()) {
			System.out.println(list_iterator.previous());
		}
		System.out.println("-----------------------------------------");
		
		//iterator for next
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for (String string:arrayList) {
			System.out.println("using for each:"+ string);
			arrayList.add("tata");
		}
	}

	public static void main(String[] args) {
		
		ArrayListExample example=new ArrayListExample();
		example.arraylistexample();

	}
}
