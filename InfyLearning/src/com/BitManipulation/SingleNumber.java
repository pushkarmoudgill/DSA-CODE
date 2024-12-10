package com.BitManipulation;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {2,2,1};
		
		int ans=nums[0];
        for(int i=1;i<nums.length;i++){


         ans^=nums[i];
        }
            System.out.println(ans);
	}

}
