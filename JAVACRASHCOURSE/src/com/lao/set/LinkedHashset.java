package com.lao.set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// example for linkedhashset insertion order is maintained

public class LinkedHashset {
	
	public void linkedhashsetexample() {
		Set linkhashset=new LinkedHashSet();
		linkhashset.add(1);
		linkhashset.add("a");
		linkhashset.add("b");
		linkhashset.add("c");
		linkhashset.add("10");
		linkhashset.add("15");
		
		System.out.println("inseration order linked hash set:"+linkhashset);
		System.out.println("size:"+linkhashset.size());
		
	}

	public static void main(String[] args) {
		
		LinkedHashset linkhashset=new LinkedHashset();
		linkhashset.linkedhashsetexample();

	}
}
