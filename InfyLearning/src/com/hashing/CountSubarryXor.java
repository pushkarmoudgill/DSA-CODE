package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountSubarryXor {
	public static void main(String [] args) {
		
		
		
		int arr[]= {4, 2, 2, 6, 4};
		int k=6;
		
		
	   Map <Integer,Integer> map=new HashMap<>();
	   
	   
	   int xr=0;
	   int count =0;
	   
	   for(int i=0;i<arr.length;i++) {
		   
		   xr^=arr[i];
		    if(xr==k) {
		    	count++;
		    }
		    
		    if(map.containsKey(xr^k)) {
		    count +=map.get(xr^k);
		    
		   
		    }
		    
		    if(map.containsKey(xr)) {
		    	 map.put(xr,map.get(xr)+1);
		    }
		    else {
		    	map.put(xr,1);
		    }
		    
		   
	   }
System.out.println(count);
}

}
