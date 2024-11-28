package com.TwoPointer;

public class MaxCardPoints {
	public static void main(String [] args) {
		
		
		
		int arr[]= {1,2,3,4,5,6,1};
		int k=3;
		
//	  
		int max=0;
		int lsum=0;
     for(int i=0;i<k;i++) {
    	 lsum+=arr[i];
     }
       int rightptr=arr.length-1;
     max=lsum;
     int rsum=0;
     for(int  i=k-1;i>=0;i--) {
    	 
    	 lsum-=arr[i];
    	 rsum+=arr[rightptr];
    	 rightptr--;
    	 
    	 
    	 max=Math.max(max, (lsum+rsum));
    	 
     }
     System.out.println(max);
}
}