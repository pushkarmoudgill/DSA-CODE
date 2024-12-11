package com.BitManipulation;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {2,2,1};
		
		int val=nums[0];
        for(int i=1;i<nums.length;i++){


         val^=nums[i];
        }
            System.out.println(val);
	}

}
