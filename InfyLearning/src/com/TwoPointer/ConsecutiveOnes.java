package com.TwoPointer;

public class ConsecutiveOnes {
	
	public static void main(String [] args) {
		int arr[] = {1,0,1,1,0,1};
		
		int max=0;
		int count =0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=1 ) {
				max=Math.max(max, count);
				count=0;
				
			}
			else if(arr[i]==1 && i==arr.length-1) {
				count++;
				max=Math.max(max, count);
				
			}
			else {
				count++;
			}
			
			
		}
		
//		return max;
		System.out.println(max);
	}

}
