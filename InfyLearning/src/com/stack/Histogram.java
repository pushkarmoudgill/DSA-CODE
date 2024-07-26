package com.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Histogram {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		//int leftidx[]=new int [n];
		
		List<Integer> list =new ArrayList<>();
		///leftidx[0]=-1;
		Stack<Integer> st= new Stack<>();
	//st.push(arr[0]);
		for(int i=0;i<n;i++) {
			if(st.isEmpty()) {
				//leftidx[i]=-1;
				list.add(-1);
				st.push(arr[i]);
			}
			else {
				///int num=(int) st.peek();
				//if(!st.isEmpty()) {
				while(arr[i]<=st.peek()) {
					st.pop();
					if(st.isEmpty()) {
						break;
					}
				}
				//}
					if(st.isEmpty()) {
					//leftidx[i]=-1;
					list.add(-1);
					st.push(arr[i]);
				}
				else {
					//leftidx[i]=(int)st.peek();
					list.add(st.peek());
					st.push(arr[i]);
				}
			}
		}
		System.out.println(list);
	}

}
