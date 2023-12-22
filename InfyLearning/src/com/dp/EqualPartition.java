package com.dp;

import java.util.Scanner;

public class EqualPartition {

public static void main (String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int j=sc.nextInt();
			//int dest=sc.nextInt();
			int arr[]=new int [j+1];
			int sum=0;
			for(int k=1;k<=j;k++) {
				arr[k]=sc.nextInt();
				
				sum+=arr[k];
				
			}
			if(sum%2!=0) {
				System.out.println("NO");
				return;
			}
			int dest=sum/2;
		int dp[][]=new int [dest+1][j+1];
		for(int l=0;l<dest+1;l++) {
			for(int k=0;k<j+1;k++) {
				dp[l][k]= -1 ;
			}
		}
		    boolean ans=findAns(arr,sum/2,j,dp);
			if(ans==true) {
		    System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		    
			
		}
		
	}

	 static boolean findAns(int[] arr, int dest, int length,int dp[][]) {
		// TODO Auto-generated method stub
		 
		 if(dest==0) {
			 return true;
		 }
		 if(dest>0 && length==0) {
			 return false;
		 }
		 if(dp[dest][length]!=-1 )
		 {
			 if(dp[dest][length]==1) {
				 return true;
			 }else {
				 return false;
			 }
		 }
		 boolean ans=false;
		 
		  ans=findAns(arr,dest,length-1,dp);
		 if(arr[length]<=dest)
		 ans= ans || findAns(arr,dest-arr[length],length-1,dp);
		 
		 if(ans==true) {
			dp[dest][length]=1; 
		 }else {
			 dp[dest][length]=0; 
		 }
		 return ans;
		 
		
	}
	
	
	
}
