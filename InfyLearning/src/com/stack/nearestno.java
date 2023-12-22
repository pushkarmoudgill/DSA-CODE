package com.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class nearestno {
	public static void solve(int[] a) {
		Stack<Integer> stack =new Stack<Integer>();
		// int first=a[0];
		// stack.push(a[0]);
		// a[0]=-1;
		for(int i=0;i<a.length;i++) {
		  	if(stack.isEmpty()) {
		  	  stack.push(a[i]);
				a[i]=-1;
				}
		else	if(stack.peek()>a[i]) {
				int in=a[i];
				//stack.push(in);
				a[i]=stack.peek();
				stack.push(in);
			}
			else {
				//if(!(stack.isEmpty())) {
				while(!(stack.isEmpty())&&stack.peek()<=a[i]) {
					stack.pop();
				}
				
				if(stack.isEmpty()) {
				  	  stack.push(a[i]);
						a[i]=-1;
						}
				else {
					int in=a[i];
					//stack.push(in);
					a[i]=stack.peek();
					stack.push(in);
				}
				
					
				
			}
			
		}
		System.out.println(Arrays.toString(a).replace("[", "")
		        .replace("]", "")
		        .replace(",", " "));
		
	}

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
				
				int n=sc.nextInt();
				int[] a =new int[n];
				for(int i=0;i<n;i++ ){ //-1 44 -1 65 65 48 65 -1 -1 91
				  a[i]=sc.nextInt();
				}
				solve(a);
}
}
