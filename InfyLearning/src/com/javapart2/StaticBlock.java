package com.javapart2;


//static block
//contents can be excuted by default without any explicit call.

class Test{
	int a=10;
	static {
		System.out.println("Static BLock");
	}
}
public class StaticBlock {
//static int a=10;
//	static {
//		System.out.println("Static BLock");
//	}
	public static void main(String [] args) {
		Test ob=new Test();
		System.out.println("MAin Method");
		//System.out.println(Test.a);
	//
		System.out.println(ob.a);

	}
}
