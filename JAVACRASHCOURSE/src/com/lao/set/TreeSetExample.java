package com.lao.set;
import java.util.Iterator;
import java.util.TreeSet;

//example for treeset .this will maintain ascending order

public class TreeSetExample {
	
	public void treesetexample() {
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		treeset.add(10);
		treeset.add(1);
		treeset.add(2);
		treeset.add(3);
		treeset.add(4);
		treeset.add(5);
		
		System.out.println("elements are sorted in ascending order: "+treeset);
		
		//first()
		System.out.println("first element:"+treeset.first());
		
		//last()
		System.out.println("last element:"+treeset.last());
		
		//headset
		System.out.println("values lesser thAn given value:"+treeset.headSet(3));
		
		//TAILSET
		System.out.println("VALUES EQUAL OR GREATER THAN VALUES:"+treeset.tailSet(5));
		
		//subset
		System.out.println("inbetween the subset values:"+treeset.subSet(2, 10));
		
		//comparator
		System.out.println("comparator returns null if the sorting ids default natural order:"+treeset.comparator());
		
		//higher
		System.out.println("next immediate higher values:"+treeset.higher(2));
		
		//lower
		System.out.println("next immediate lower values:"+treeset.lower(3));
		
		//pollfirst
		System.out.println("poll first:"+treeset.pollFirst());
		
		//polllast
		System.out.println("poll last:"+treeset.pollLast());
		
		//after polling
		System.out.println("after polling:"+treeset);
		
		//descending order
		System.out.println("descending order:"+treeset.descendingSet()           );
	}

	public static void main(String[] args) {
		
		TreeSetExample treesetexample=new TreeSetExample();
		treesetexample.treesetexample();
	}
}
