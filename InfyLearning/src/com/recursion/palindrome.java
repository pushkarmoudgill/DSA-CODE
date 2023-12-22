package com.recursion;

public class palindrome {
	public static void rec(int i,String str,String new1) {
		int length=str.length()-1;
		//String new1="";
		while(length>=0) {
			//int i=0;
			if(i==length) {
				new1=new1+str.charAt(i);
				length--;
				i--;
				//return;
			}
			else {
			rec(i+1,str,new1);
			}
			//rec()
		}
		if(new1.equals(str)) {
			System.out.println("yes");
		return;
		}
		else {
			System.out.println("no");
		}
		//return;
	}
	public static void main(String[] args) {
		
		String str="ABA";
		int i=0;
		String new1="";
		//char c=str.charAt(i);
		rec(i,str,new1);
		
		if(new1.equals(str)) {
			System.out.println("yes");
		
		}
		else {
			System.out.println("no");
		}
	}

}
