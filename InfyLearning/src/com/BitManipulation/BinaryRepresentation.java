package com.BitManipulation;

public class BinaryRepresentation {
	
	public static void main(String [] args) {
		int num=5;
		
		while(num>0) {
			int n=num & 1;
			System.out.println(n);
			
			num=num>>1;
		}
	}

}
