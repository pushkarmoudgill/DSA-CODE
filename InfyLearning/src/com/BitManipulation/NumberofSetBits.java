package com.BitManipulation;

public class NumberofSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		 int c=0;
		
		for(int i=0;i<32;i++) {
			
			if((n&(1<<i))>0) {
				c++;
			}
		}
		
		System.out.println(c);

	}

}
