package com.polymorphism;
///same method name -same class -diff signature
class poly{
	void add() {
		
		System.out.println(2+3);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
}
public class PolyDemo {
public static void main(String[] args) {
	poly obj=new poly();
	obj.add(2,3);
}
}
