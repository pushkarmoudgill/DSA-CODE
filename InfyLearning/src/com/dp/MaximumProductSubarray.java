package com.dp;

public class MaximumProductSubarray {
	
	public static void main(String [] args) {
		int nums[]= { 1, -2, -3, 0, 7, -8, -2};
		
		
		
	
        
        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
        
			// Swapping min and max
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
                


            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);


            ans = Math.max(ans, max);
        }
        
      
System.out.println(ans);
    
}}
