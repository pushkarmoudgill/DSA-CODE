package com.searching;

import java.util.Scanner;

public class candies {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	
	long l=0;long r=(long) 1e18;
	
	while(l+1<r) {
		long mid=(l+r)/2;
		if((mid*(mid+1))/2<=n) {
			l=mid;
		}else {
			r=mid;
		}
	}
	System.out.println(l);
}
}
