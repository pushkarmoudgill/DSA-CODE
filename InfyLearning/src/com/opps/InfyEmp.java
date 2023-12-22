package com.opps;
class Infy{
	String Name;
	int emp_Id;
	long phone_Number;
	char designation;
	
}	

class dev{
	String teamName;
	int teamNo;
}
public class InfyEmp {
	public static void main(String[]args) {
		Infy d1 = new Infy();
		d1.designation ='M';
		d1.emp_Id=1315526;
		d1.Name="Pushkar";
		d1.phone_Number=1234;
		Infy d2 = new Infy();
		
		Infy d3 = new Infy();
		
		
		d3.phone_Number=9807654321L;
		d3.phone_Number=123l;


		System.out.println(d1.emp_Id);
		System.out.println(d2.emp_Id);
		System.out.println(d3.phone_Number);
		
		dev devOb=new dev();
		devOb.teamName="AB";
		System.out.println(devOb.teamName);
		


	}
}
