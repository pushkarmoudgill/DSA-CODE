package com.BitManipulation;

public class TwoPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		
		boolean ans=findpower(num);
		System.out.println(ans);

	}
	
	
	static boolean findpower(int num) {
		
		return num>0 &&( num&(num-1))==0;
	}

}
