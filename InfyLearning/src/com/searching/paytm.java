package com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class paytm {
////	public static void solve(int[] arr,int q) {
////		Scanner sc =new Scanner(System.in);
//		int arr1[]=new int[q];
//	for(int i=0;i<q;i++) {
//	
//		arr1[i]=sc.nextInt();
//			int l=0;
//			int r=arr.length-1;
//			int a=0;
//			while(l<=r) {
//			int mid=(l+r)/2;
//			if(arr1[i]>arr[mid]) {
//				l=mid+1;
//			}
//			else if(arr1[i]<arr[mid]) {
//				r=mid-1;
//			}
//			else {
//				arr1[i]=mid;
//				//i++;
//				a=arr1[i];
//				break;
//			}
//		}
//			System.out.println(a);
//		}
////	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int q=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}

	//solve(arr,q);
	int arr1[]=new int[q];
	for(int i=0;i<q;i++) {
	
		arr1[i]=sc.nextInt();
			int l=0;
			int r=arr.length-1;
			int a=0;
			while(l<=r) {
			int mid=(l+r)/2;
			if(arr1[i]>arr[mid]) {
				l=mid+1;
			}
			else if(arr1[i]<arr[mid]) {
				r=mid-1;
			}
			else {
				arr1[i]=mid;
				//i++;
				a=arr1[i];
				break;
			}
		}
			System.out.println(a);
		}
}
}
