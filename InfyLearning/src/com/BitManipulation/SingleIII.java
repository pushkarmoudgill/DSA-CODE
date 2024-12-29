package com.BitManipulation;

public class SingleIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nums[]= {1,2,1,3,2,5};
            int xor=0;
		for(int i=0;i<nums.length;i++) {
			xor^=nums[i];
		}
		
		int mask =xor&(-xor);
		
		int xor1=0,xor2=0;
		
		for(int i:nums) {
			
			if((mask&i)==0) {
				xor1^=i;
			}
			else {
				xor2^=i;
			}
			
		}
		
		System.out.println(xor1+" "+xor2);
	}

}
