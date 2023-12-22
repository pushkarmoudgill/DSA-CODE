package com.matrix;

import java.util.Scanner;


public class lookup {
	public static void find(int[][]arr,int n,int m,int num) {
		int row=0;int col=m-1;
		while(col>=0&&row<=n-1) {
		if(arr[row][col]==num) {
			System.out.println("Yes");
			break;
		}
		else {
			if(arr[row][col]>num) {
				col--;
			}
			else {
				row++;
			}
		}
		if(col==-1||row==n) {
			System.out.println("No");
		}
		
	}
	}
	public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int num=sc.nextInt();
	int[][] arr=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
//	for(int i=0;i<n;i++) {
//		for(int j=0;j<m;j++) {
//System.out.print(arr[i][j]+" ");
//		}
//		System.out.println();
//	}
	find(arr,n,m,num);
}
}