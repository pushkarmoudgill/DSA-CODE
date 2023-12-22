package com.javapart2;


class A1{
	int i=10;
}
class B1 extends A1{
	int i=20;
	void show(int i) {
		System.out.println(i);
	}
}
public class diffbetweenthisandsuper {
public static void main(String [] args) {
	B1 ob =new B1();
	ob.show(2);
}
}
