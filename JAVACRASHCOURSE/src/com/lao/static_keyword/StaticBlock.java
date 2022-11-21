package com.lao.static_keyword;

public class StaticBlock {
	// example for static block. static block is {}.inside the static block 
	//,execute in written program order.
	
	static {
		System.out.println("inside static block1");
	}
	static {
		System.out.println("inside static block2");
	}

	public static void main(String[] args) {
		System.out.println("inside main method");
	}

}
