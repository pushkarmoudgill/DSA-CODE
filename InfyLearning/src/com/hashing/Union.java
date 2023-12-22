package com.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Union {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[] arr1=new int[n];
	int[] arr2=new int[m];
	for(int i=0;i<n;i++) {
		 arr1[i]= sc.nextInt();	
	}
	//int arr1[]= {7,6,9,2};
	//int arr2[]= {7,2,7,2};
	for(int i=0;i<m;i++) {
		 arr2[i]= sc.nextInt();	
	}
	
	 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	 for(int i=0;i<arr1.length;i++) {
     	
     	map.put(arr1[i],1);
     }
	 for(int i=0;i<arr2.length;i++) {
     	if(map.containsKey(arr2[i])) {
     		map.put(arr2[i],map.get(arr2[i])+1);
     	}else {
     	map.put(arr2[i],1);
     	}
     }
	// System.out.println(map);
	 for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
         System.out.print(entry.getKey() + " ");
       }
     
}
}
