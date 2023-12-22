package com.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class TwoNumSum {
	// static int count=1;
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
		  int num2=s-arr[i];
		  if(map.containsKey(num2)) {
			  System.out.println((map.get(num2)+1)+" "+  (++i));
			  flag=1;
			  break;
		  }
		  map.put(arr[i],count++);
	  }
		if(flag==0) {
			System.out.println(-1);
		}
    }
}
