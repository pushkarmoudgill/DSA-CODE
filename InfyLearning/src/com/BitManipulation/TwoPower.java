package com.BitManipulation;

public class TwoPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		
		boolean ans=power(num);
		System.out.println(ans);

	}
	
	
	static boolean power(int num) {
		
		return num>0 &&( num&(num-1))==0;
	}

}
