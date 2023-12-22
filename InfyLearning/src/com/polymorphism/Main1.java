package com.polymorphism;

import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int numbers[]=new int[size];
	
	for(int i=0;i<size;i++) {
		numbers[i]=sc.nextInt();
	}
	for(int i=0;i<numbers.length;i++) {
//		if(numbers[i]==0) {
//			System.out.println("1");
//		}
		int k=1;
		int factorial=1;
		while(k<=numbers[i]) {
			factorial=factorial*k;
			k++;
		}
		System.out.println(factorial);
	}
}
}
