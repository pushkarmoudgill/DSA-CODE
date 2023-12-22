package com.stack;

import java.util.Scanner;

public class towerofhanoi {
	static int count=0;
	public static void noofmoves(int n,char a,char b,char c) {
		if(n==1) {
		}
		else {
			noofmoves(n-1,a,c,b);
			count++;
			noofmoves(n-1,b,a,c);
			count++;
		}
	}
	
	public static void move(int n,char a,char b,char c) {
		if(n==1) {
			
			System.out.println(n+" "+a+" "+c);
			
		}
		else {
			move(n-1,a,c,b);
			//count++;
			System.out.println(n+" "+a+" "+c);
			move(n-1,b,a,c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=4;
		noofmoves(n,'1','3','2');
		count++;
		System.out.println(count);
		move(n,'1','3','2');
		
	}

}
