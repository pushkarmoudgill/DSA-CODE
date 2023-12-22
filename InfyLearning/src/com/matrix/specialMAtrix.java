package com.matrix;

import java.util.Scanner;

public class specialMAtrix {
	public static void cal(int[][]arr,int n) {
		int sum1=0;
		int max=0;
				for(int i=0;i<n;i++) {
					int sum=0;
					for(int j=0;j<n;j++) {
						sum+=arr[i][j];
					}
					sum1+=sum;
					max=Math.max(max, sum);
				}
				for(int i=0;i<n;i++) {
					int sum=0;
					for(int j=0;j<n;j++) {
						sum+=arr[j][i];
					}
					//sum1+=sum;
					max=Math.max(max, sum);
				}
				
			int op=max*n - sum1;
			
			System.out.println(op);
	}
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
	//	int m=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		cal(arr,n);
	}
}
