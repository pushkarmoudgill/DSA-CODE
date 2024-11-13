package com.TwoPointer;

public class MaxWater {
public static void main(String [] args) {
	
	
	int arr[]= {1,8,6,2,5,4,8,3,7};
	
	
	int l=0;
	int r=arr.length-1;
	
	int max=0;
	
	
	while(l<r) {
		
		int left=arr[l];
		int right=arr[r];
		
		int min_h=Math.min(left, right);
		
		int len=r-l;
		
		int area=min_h*len;
		
		
		
		max=Math.max(max, area);
		
		
		
		if(left>right) {
			r--;
		}
		else {
			l++;
		}
		
		
	}
	
System.out.println(max);
}
}
