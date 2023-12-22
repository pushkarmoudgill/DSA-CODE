package com.BitManipulation;

import java.util.Scanner;

public class MaxAnd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	int res=0;
		for(int i=31;i>=0;i--) {
			int count=findNoofones(res|(1<<i),arr,n);
			
			if(count>=2) {
				res=res|(1<<i);
			}
		}
		System.out.println(res);
		
	}
	public static int findNoofones(int pattern,int[] arr,int n) {
		int count =0;
		for(int i=0;i<n;i++) {
			if((pattern&arr[i])==pattern) {
				count++;
			}
		}
		return count;
	}

}
