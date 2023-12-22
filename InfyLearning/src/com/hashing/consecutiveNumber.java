package com.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class consecutiveNumber {
	public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int conNum=0;
	for(int i=0;i<n-1;i++) {
		int sub=arr[i+1]-arr[i];
		if(sub==1) {
			conNum++;
		}
		else {
			break;
		}
	}
	System.out.println(conNum + 1);
}
}