package com.javapart2;

class Subject{
	String subject="java";
}
class Student{
	int roll=20;
	String name="Tom";
			Subject sb =new Subject();  //aggreagtion
			void disp() {
				System.out.println("name is "+name+" subject is "+sb.subject);//code reusability
			}
}
public class Aggregation {
	public static void main(String [] args) {
	Student stu =new Student();
	stu.disp();

}}
