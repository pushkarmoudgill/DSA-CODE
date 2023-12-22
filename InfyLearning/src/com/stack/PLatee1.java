package com.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PLatee1 {
	public static void compare(int[] arr1,int[]arr2) {
		Stack<Integer> stack = new Stack<Integer>();
		int n=arr1.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr1[i]==arr2[j]) {
				i++;
				j++;
			}
			else	if(arr1[i]!=arr2[j]) {
				if(stack.size()!=0) {
					if(arr1[i]==stack.peek()) {
						stack.pop();
						
						i++;
					}
				}
				else {
					stack.push(arr1[i]);
					i++;
				}
			}
			
		}
		if(stack.size()==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
			//arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
			//arr2[i]=sc.nextInt();
		}
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		compare(arr1,arr2);
		
		
		
	}

}
