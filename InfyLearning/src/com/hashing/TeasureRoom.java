package com.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class TeasureRoom {
	public static void main(String[] args)
    {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=sc.nextInt();
	int [] arr=new int[n];
	int flag=0;
	int count=0;
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			int num3=s-(arr[i]+arr[j]);
			if(map.containsKey(num3)) {
				System.out.println((map.get(num3)+1)+" "+(++i)+ " "+(++j));
				flag=1;
			break;
			}
			if(flag==1) {
				break;
			}
			
		}
		map.put(arr[i], count++);
	}
	if(flag==0) {
		System.out.println(-1);
	}
}
}