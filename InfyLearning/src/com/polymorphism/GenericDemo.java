package com.polymorphism;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
public class GenericDemo {
	public static void main(String [] args) {
		A obj=new A();
		B objb=new B();
		B objc=new C();
		display(obj);  //parent object
		display(objb);
		display(objc);

	}
	public static void display(A a) {
		
	}

}
