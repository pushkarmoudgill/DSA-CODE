package com.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class bracket {
	public static void solve(String s) {
		Stack<Integer> st=new Stack<Integer>();
		int[] arr=new int[s.length()];
		Arrays.fill(arr, -1);
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='(') {
			st.push(i);
		}
		else {
			if(!st.empty()) {
				int val=(int) st.peek();
				st.pop();
				arr[i]=val;
				arr[val]=i;
			}
			
		}
		}
		System.err.println(Arrays.toString(arr).replace("[", "")
		        .replace("]", "")
		        .replace(",", " "));
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	solve(s);
}
}
