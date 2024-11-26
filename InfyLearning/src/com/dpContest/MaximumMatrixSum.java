package com.dpContest;

public class MaximumMatrixSum {

	
	public static void main(String []args) {
		int mat[][]= {{1,2,3},{-1,-2,-3},{1,2,3}};
		
		int negSum=0;
		int sum=0;
	int minpos=Integer.MAX_VALUE; 
	int maxneg=Integer.MIN_VALUE;
	int neg=0;
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				
				if(mat[i][j]<0) {
					neg+=1;
					
					negSum-=(mat[i][j]);
					
					maxneg=Math.max(maxneg, mat[i][j]);
				}
				else {
					sum+=mat[i][j];
					
					minpos=Math.min(minpos, mat[i][j]);
				}
				
			}}
			if((neg & 1)==0) {
				int val1=sum+negSum;
				System.out.print(val1);
			}else {
				int val=sum+negSum - 2 * Math.min(-maxneg,minpos);
				System.out.println(val);
			}
		
	}
}
