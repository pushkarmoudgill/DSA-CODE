package com.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueWindow {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int[] arr=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(int i=0;i<k;i++) {
		if(map.containsKey(arr[i])) {
    		map.put(arr[i],map.get(arr[i])+1);
    	}else {
    	map.put(arr[i],1);
    	}
		//map.put(arr[i],1);
	}
	System.out.print(map.size()+" ");
	int start=0;
	for(int i=k;i<n;i++) {
		map.put(arr[start], map.get(arr[start])-1);
		if(map.get(arr[start])==0) {
			map.remove(arr[start]);
		}
		if(map.containsKey(arr[i])) {
    		map.put(arr[i],map.get(arr[i])+1);
    	}else {
    	map.put(arr[i],1);
    	}
		//map.put(arr[i],1);
		//map.remove(arr[start]);
		System.out.print(map.size()+" ");
		start++;
	}
}
}
