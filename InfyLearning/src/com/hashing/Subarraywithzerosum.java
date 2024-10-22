package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class Subarraywithzerosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {15,-2,2,-8,1,7,10,23};
		
		
		int n=arr.length;
		
		Map<Integer,Integer> map=new HashMap<>();
		
		
		int sum=0;
		int max=0;
		map.put(sum,-1);
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
			if(map.containsKey(sum) ){
				int len=i- map.get(sum);
				max=Math.max(max, len);
			}
			
			else {
				map.put(sum, i);
			}
			
			
		}
System.out.println(max);
	}

}
