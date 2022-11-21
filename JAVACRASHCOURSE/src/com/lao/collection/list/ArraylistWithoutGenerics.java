package com.lao.collection.list;

import java.util.ArrayList;
import java.util.List;

//can insert heterogeneous objects without generics
//generics is <>
public class ArraylistWithoutGenerics {

	public static void main(String[] args) {
		
		
		List al =new ArrayList();
		al.add(1);
		al.add("String");
		System.out.println(al);

	}

}
