package com.dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapSack {
	
	
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		
		int n=sc.nextInt();
		int c=sc.nextInt();
		
		double arr[][] =new double [n][3];
		
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			int weight=sc.nextInt();
			
			double f=val/weight;
			
			arr[i][0]=f;
			arr[i][1]=val;
			arr[i][2]=weight;
		}
		
		
		
		
		////sort in descending order acc. to col.
		Comparator<double[]> comp = new Comparator<double[]>() {
	         public int compare(double[] val1, double[] val2) {
	            if(val1[0] < val2[0]) {
	               return 1;
	            } else {
	               return -1;
	            }
	         }
	      };
	      Arrays.sort(arr, comp);

		
		double ans=fKnapsack(c,arr,n);
		System.out.println(ans);
	}
	
	static double fKnapsack(int c, double[] []arr,int n) {
		double ans=0;
		
		
		for(int i=0;i<n;i++) {
			if(arr[i][2]<=c) {
				c=(int) (c- (arr[i][2]));
				ans+=arr[i][1];
				
			}else {
				//c=0;
				ans+=arr[i][0]*c;
				break;
			}
		}
		return ans;
	}

}
