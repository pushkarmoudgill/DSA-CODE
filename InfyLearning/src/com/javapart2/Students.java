package com.javapart2;

class Subject1 {
	private String subjectName;

	Subject1(String subjectName) {
		this.subjectName = subjectName;
	}
	void setsubjectName(String subjectName){
	this.subjectName=subjectName;
}
	String getsubjectName(){
     return subjectName;
	}
}

public class Students {
	private int rollNo;
	private String studentName;
	private Subject1 subject;

	Students(int rollNo, String studentName, Subject1 subject) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.subject = subject;
	}

	public void displayDetails() {
		System.out.println("Student Name: " + studentName);
		System.out.println("Subject Name: " + subject.getsubjectName());

		// We cannot directly access the private member of the class Subject
		// To access the private members of aggregated class, we will have to
		// make use of the getter and setter methods

		// Add the getter and setter methods to class Subject and modify the
		// displayDetails method accordingly

	}

	public static void main(String args[]) {
		Subject1 subject = new Subject1("Maths");
		subject.setsubjectName("Maths");
		Students student = new Students(101, "Nate", subject);
		student.displayDetails();
	}
}
