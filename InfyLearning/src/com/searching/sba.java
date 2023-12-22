package com.searching;

import java.util.Scanner;

public class sba {
	public static void solve(int[] arr) {
		int l=0;
		int r=arr.length-1;
	//	for(int i=0;i<arr.length;i++) {
		if(arr[r]==0) {
			r=arr.length;
			l=arr.length-1;
			System.out.print(r+" "+l);
		}
		else if(arr[l]==1) {
			r=0;
			l=-1;
			System.out.print(r+" "+l);
		}
		else {
		while(l+1<r) {
			int mid=(l+r)/2;
			if(arr[mid]==0) {
				l=mid;
			}
			else {
				r=mid;
			}
		}
		System.out.print(r+" "+l);
		
		}
	}
	public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	solve(arr);

	}

}
