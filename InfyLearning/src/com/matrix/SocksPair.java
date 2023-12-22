package com.matrix;

import java.util.HashMap;
import java.util.Map;

public class SocksPair {
public static void main(String[] args) {
	int [] arr= {1,1,1,2,3,2,};
	
	HashMap<Integer,Integer> map=new HashMap<>();
	
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i]))
			map.put(arr[i],map.get(arr[i])+1);
		else
		map.put(arr[i], 1);
	}
	int c=0;
	 for (Map.Entry<Integer,Integer> entry : map.entrySet())  
	 c=c+entry.getValue()/2;
	System.out.println(c);
}
}
