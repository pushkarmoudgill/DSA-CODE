package com.javapart2;

class counter{
	static int counter =0;
	
	static void disp() {
		System.out.println("DISP");
	}
static 	void display()//static method belongs to a class not objects, 2.static methos access only static data 
	{ //staic method cannot refer this or super keyword
	disp();//static method called only static methods not non-static method
	counter++;
		System.out.println(counter);
	}
}

public class StaticMethod {
public static void main(String[] args) {
	counter c1 =new counter();
	c1.display();
	counter c2 =new counter();
c2.display();
	counter.display();//accessing static method using className
	counter.display();
}
}
