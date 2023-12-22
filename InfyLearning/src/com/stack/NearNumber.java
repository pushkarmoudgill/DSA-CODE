package com.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NearNumber {
	public static void solve(int[] a) {
		Stack<Integer> stack =new Stack<Integer>();
		int first=a[0];
		stack.push(a[0]);
		a[0]=-1;
		for(int i=1;i<a.length;i++) {
			if(stack.peek()>a[i]) {
				int in=a[i];
				//stack.push(in);
				a[i]=stack.peek();
				stack.push(in);
			}
			else {
				while(!stack.isEmpty()) {
					stack.pop();
					
					if(stack.peek()>a[i]) {
						int in=a[i];
						//stack.push(in);
						a[i]=stack.peek();
						stack.push(in);
						break;
					}
					if(stack.peek()==first) {
						int in=a[i];
						//stack.push(in);
						a[i]=-1;
						stack.push(in);
						break;
						
						//break;
					}
				}
				if(stack.isEmpty()) {
				a[i]=-1;
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
