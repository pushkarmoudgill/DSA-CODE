package com.javapart2;

class A{
A(int num){//parameterized Constructor
		//super();
	System.out.println("Parameterwith A Constructor "+ num);
}
A(){
	System.out.println("open");
}
void display() {
	System.out.println("parent class");
}
}
class B extends A{
void display()
{
	System.out.println("in child class");
}
void show() {
	super.display();//immediate parent class object
	display();
}
	B(){
		super(2);// mandatory in parametrized but not mandatory in parameterless and default Constructor

		System.out.println("Parameterless B Constructor");
	}
	A ob =new A();

}
public class InheritConstructor {
	public static void main(String[]args) {
		B obj =new B();
		obj.show();
	}

}
