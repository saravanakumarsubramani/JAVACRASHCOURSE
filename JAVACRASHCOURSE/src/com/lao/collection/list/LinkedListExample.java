package com.lao.collection.list;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample {
	
	//example for linked list

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(4);
		
		System.out.println("linked list:"+linkedlist);
		
		//add an element to the first position
		
		linkedlist.addFirst(1);
		System.out.println("linked list after adding first"+linkedlist);
		
		// add an element to last
		linkedlist.addLast(5);
		System.out.println("linked list after adding last:"+linkedlist);
		
		
		// get the first value
		System.out.println("first value:"+linkedlist.getFirst());
		
		//get the first value using index position
		System.out.println("first value using index position:"+linkedlist.get(0));
		
		System.out.println("third value using index position:"+linkedlist.get(3));
		
		//removefirst and removelast
		
		System.out.println("remove first:"+linkedlist.removeFirst());
		System.out.println(linkedlist);
		System.out.println("remove last:"+linkedlist.removeLast());
		System.out.println(linkedlist);
		
		//POLL method and pollfirst() deletes the first element in the list
		
		System.out.println(linkedlist.poll());
		System.out.println(linkedlist);
		
		//poll last deletes the last
		
		linkedlist.pollLast();
		System.out.println(linkedlist);
		
		//remove deletes the first element
		linkedlist.remove();
		System.out.println(linkedlist);
		
		//adding
		linkedlist.addFirst(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(5);
		linkedlist.add(6);
		System.out.println(linkedlist);
		
		//remove first occurence
		linkedlist.removeFirstOccurrence(2);
		System.out.println("after removing the first occurence of 2"+linkedlist);
		
		//remove last occurrence
		linkedlist.removeLastOccurrence(6);
		System.out.println("after removing the last occurence of 6"+linkedlist);
		System.out.println("-----------------------------------------------");
		
		// iteration of linked list with advanced for each loop
		//iteration of linked list with advanced for loop
		// iteration of linked list with advanced while l	

	}

}
