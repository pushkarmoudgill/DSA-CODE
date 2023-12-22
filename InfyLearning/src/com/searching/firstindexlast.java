package com.searching;

import java.util.Scanner;

//public class firstindexlast {

	import java.util.Scanner;

	public class firstindexlast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int q=sc.nextInt();
		int[] arr=new int[no];
		for(int i=0;i<no;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<q;i++) {

			int n=sc.nextInt();
			
			int l=-1;
			int r=arr.length;
			while(l+1<r) {
				int mid=l+(r-l)/2;
				if(n>arr[mid]) {
					l=mid;
				}
				else {
					r=mid;
				}
			}
			int first=r;
			if(r==arr.length||arr[r]!=n) {
				System.out.println("-1"+"-1");
			}
			else {
				l=-1;
				 r=arr.length;
				while(l+1<r) {
					int mid=l+(r-l)/2;
					if(n>=arr[mid]) {
						l=mid;
					}
					else {
						r=mid;
					}
				}
				int last =l;
				System.out.print(first+" "+last);
			}
//			int last =l;
//			System.out.print(first+" "+last);
		}
	}
	}