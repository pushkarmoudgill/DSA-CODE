package com.graph;

import java.util.Scanner;


public class AdMatrixToList {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			System.out.print((i+1) + ":"+" ");
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				
				if(arr[i][j]==1) {
					System.out.print((j+1) + " ");
				}
				
			}
			System.out.println();
		}
		
		
		
	}
}
