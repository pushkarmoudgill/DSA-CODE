package com.BitManipulation;

public class TwoPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		boolean ans=power(n);
		System.out.println(ans);

	}
	
	
	static boolean power(int n) {
		
		return n>0 &&( n&(n-1))==0;
	}

}
