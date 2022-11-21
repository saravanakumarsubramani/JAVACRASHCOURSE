package com.lao.string_concepts;

public class StringBufferExamples {
	
	//example for stringbuffer,stringbuilder and string
	//stringbuffer and stringbuilder is mutable and change

	public static void main(String[] args) {
		
		System.out.println("string is immuntable");
		String name="arya";
		System.out.println("appending a name to original:"+name.concat("prasath"));
		System.out.println("original name:"+name);
		System.out.println("********************************************");
		System.out.println("stringbuffer is mutable");
		StringBuffer name1=new StringBuffer("arya");
		System.out.println("appending a name to original:" +name1.append("prasath"));
		System.out.println("original name:"+name1);
		
		//stringbuffer methods example
		
		//reverse
		System.out.println("reversed name:"+name1.reverse());
		
		//replace
		StringBuffer replcethis=new StringBuffer("arul");
		System.out.println(replcethis.replace(0, 3, "riya"));
		
		//delete
		StringBuffer delete=new StringBuffer("xyzarul");
		System.out.println(delete.delete(0, 3));
		
		//insert
		StringBuffer insert=new StringBuffer("moni");
		System.out.println(insert.insert(4,"sha"));
		
		//capacity
		System.out.println(insert.capacity());
		
		//like string we have chartat,substring,length,methods as well
	}
}
