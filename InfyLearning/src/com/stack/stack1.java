package com.stack;

import java.util.Stack;

public class stack1 {
	 public static void main(String args[])
	    {
	        // Creating an empty Stack
	        Stack<Integer> stack = new Stack<Integer>();
	        stack.add(1);
	        stack.push(4);
	        stack.add(2);
	        stack.pop();
	        
	        char a='1';
	        
	        
	        System.out.println(stack.peek());
	 
}
}