package com.javapart2;

public class Objdemo {
	int id;
	String name;
	Objdemo(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String [] args) {
		Objdemo ob1=new Objdemo(10,"Tom");
		Objdemo ob2=new Objdemo(10,"Tom");
		Objdemo ob3=ob1;
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));//check the addresses not the value

	}

}
