package com.opps1;

public class stringClass {
	public static void main(String [] args) {
	//1
		String s ="Dev";
		String s11="Dev";
		System.out.println(s==s11);
		//2	
		String s1 =new String("Pushkaar");
		String s2 =new String("Push kar");
		System.out.println(s1==s2);//compare object
		System.out.println(s1.equals(s2));//compare value
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));

	}

}
