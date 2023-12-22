package com.recursion;

import java.util.*;
class SubsetGen {
	long sum=0;
	static long totalsum=0;
	static long ans=Integer.MAX_VALUE;
    public static void  subset(int idx,long[] arr,long sum) {
    	
    	if(idx==arr.length) {
    		  long firstSum=sum;
    		  long sSum=totalsum-sum;
    		  ans=Math.min(ans,Math.abs(firstSum-sSum));
    		return;
    		
    	}
    	subset(idx+1,arr,sum);
    	
    	subset(idx+1,arr,sum+arr[idx]);
    	
    }


    public static void main(String args[]) {

    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] arr=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
			totalsum+=arr[i];
		}
	
		subset(0,arr,0);
		System.out.println(ans);
       
    }

}