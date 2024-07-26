package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tripRevise {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		ArrayList<Map<String,Integer>> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(new  HashMap<>() );
		}
		
		Map<String,Integer> map=new HashMap<>();
		
		int count=0;
		for(int i=0;i<m;i++) {
			String str1=sc.next();
			String str2=sc.next();
			String str3=sc.next();
			
			int a=0;int b=0;
			
			if(map.containsKey(str1)) {
				a=map.get(str1);
			}
			else {
				a=count++;
				map.put(str1, a);
			}
			
			if(map.containsKey(str2)) {
				b=map.get(str2);
			}
			else {
				b=count++;
				map.put(str2, b);
			}
			 
			list.get(a).put(str3,b);
			
		}
		System.out.println(list);
	}

}
