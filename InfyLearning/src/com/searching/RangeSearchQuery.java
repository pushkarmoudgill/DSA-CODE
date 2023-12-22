package com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSearchQuery {
	
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int q=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	//solve(arr,q);
	Arrays.sort(arr);
	
	for(int i=0;i<q;i++) {
		long a=sc.nextLong();
		long b=sc.nextLong();
		int l=-1;int r=arr.length;
				
		 while(l+1<r) {
			 int mid=(l+r)/2;
			 if(a>=arr[mid]) {
				 l=mid;
			 }
			 else
				 r=mid;
		 }
		 int left=l;
		 
		 l=-1;r=arr.length;
		 while(l+1<r) {
			 int mid=(l+r)/2;
			 if(b<=arr[mid]) {
				 r=mid;
			 }
			 else
				 l=mid;
		 }
		 int ryt=r;
		 int c=(ryt-left)+1;
		 System.out.print(c);
	}
}
}
