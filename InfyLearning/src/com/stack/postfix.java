package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class postfix {
	public static void solve(String s) {
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<s.length();i+=2) {
		char c=s.charAt(i);	
		
		switch(c) {
		case '+':
		int n2=st.peek();
		st.pop();
		int n1=st.peek();
		st.pop();
		n2=n1+n2;
		st.add(n2);
		break;
		case '-':
			 n2=st.peek();
			st.pop();
			 n1=st.peek();
			st.pop();
			n2=n1-n2;
			st.add(n2);
			break;
		case '*':
			 n2=st.peek();
			st.pop();
			 n1=st.peek();
			st.pop();
			n2=n1*n2;
			st.add(n2);
			break;
		case '/':
		 n2=st.peek();
			st.pop();
			 n1=st.peek();
			st.pop();
			n2=n1/n2;
			st.add(n2);
			break;
			default:
				st.add((int)c-48);
		
		}
		}
		System.out.println(st.peek());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		solve(s);
	}

}
