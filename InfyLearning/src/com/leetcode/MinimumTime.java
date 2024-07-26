package com.leetcode;

import java.util.Scanner;

public class MinimumTime {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	String colors = "abaac";
	int arr[] = {1,2,3,4,5};
	
	int ans=0;
	
	for(int i=1;i<colors.length();i++) {
		int a=i;
		int b=i-1;
		if(colors.charAt(i)==colors.charAt(i-1)) {
			ans+=Math.min(arr[i], arr[i-1]);
		}
	}
	System.out.println(ans);
}
}
