package com.matrix;

import java.util.Scanner;

public class MatrixTraversal {
	public static void traverse(int[][] arr,int n,int m) {
	
		int top=0;
		int left=0;
		int right=m-1;
		int bottom=n-1;
		while(left<=right && top<=bottom) {
		
		for(int i=left;i<=right;i++) {
			System.out.print(arr[top][i]+" ");
		}
		top++;
		for(int i=top;i<=bottom;i++) {
			System.out.print(arr[i][right]+" ");
		}
		right--;
		if(top<=bottom) {
		for(int i=right;i>=left;i--) {
			System.out.print(arr[bottom][i]+" ");
		}
		bottom--;
		}
		if(left<=right) {
		for(int i=bottom;i>=top;i--) {
			System.out.print(arr[i][left]+" ");
		}
		left++;
		}
	}
	}
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//			System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		traverse(arr,n,m);
	}

}
