package com.dp;

public class ZeroandOne {
	
	public static void main(String [] args) {
		String []arr = {"10","0001","111001","1","0"};
		
		int m=5,n=3;
		
		int [][][]dp=new int [m+1][n+1][arr.length+1];
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				for(int k=0;k<arr.length+1;k++) {
					dp[i][j][k]=-1;
				}
			}
		}
	int 	 ans=maxStick(m,n,arr.length-1,arr,dp);
		System.out.println(ans);
	}

	
	static int maxStick(int m,int n ,int i,String [] arr,int [][][]dp)
	{
		if(m==0&&n==0) {
			return 0;
		}
		if(i<0) {
			return 0;
		}
		if(dp[m][n][i]!=-1) {
			return dp[m][n][i];
		}
		
		String s=arr[i];
		
		int count_zero=0;
		int count_one=0;
		for(int j=0;j<s.length();j++) {
		if(s.charAt(j)=='1') {
			count_one++;
		}
		if(s.charAt(j)=='0') {
			count_zero++;
		}
		}
		
		int take=0;
		int nottake=0;
		if(count_zero<=m&&count_one<=n) {
			take=1+maxStick( m-count_zero, n -count_one, i-1, arr,dp);
			
			
		}
		
		nottake=maxStick(m,n,i-1,arr,dp);
		
		dp[m][n][i]=Math.max(take, nottake);
		return 	dp[m][n][i];
	}
	

}
