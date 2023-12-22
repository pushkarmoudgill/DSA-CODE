package com.javapart2;

 class Customer {
	String Brand="Nike";
	void shop() {
		System.out.println("Main class");
	}

}
class RegularCustomer extends Customer{
	void display() {
		System.out.println("Regular customer");
	}
	
}
class Guest extends Customer{
	void view() {
		System.out.println("Guest customer");
	}
}
public class Inheritance{
	public static void main(String [] args) {
		RegularCustomer ob =new RegularCustomer();
	ob.display();
	ob.shop();
	}
}

