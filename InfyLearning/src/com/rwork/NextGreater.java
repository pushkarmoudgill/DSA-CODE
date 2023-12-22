package com.rwork;

import java.util.Scanner;

public class NextGreater {

	
	static int min=Integer.MAX_VALUE;
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int ans=smallestGreaterElement(n);
		System.out.println(ans);
		
	}
	static int smallestGreaterElement(int n) {
		String temp=Integer.toString(n);
		int [] numbers=new int [temp.length()];
		for(int i=0;i<temp.length();i++) {
			numbers[i]=Character.getNumericValue(temp.charAt(i));
		}
		findCombination(numbers,0,n);
		if(min==2147483647)
			return -1;
		else
		return min;
	}
	static void  findCombination(int [] numbers,int i,int n) {
		if(i==numbers.length) {
			String val="";
			for(int j=0;j<numbers.length;j++) {
				val=val+numbers[j]+"";
			}
			//System.out.println(val+"");
		int 	comp=Integer.parseInt(val);
		//System.out.println("Int"+comp);
		
		if(comp>n) {
			min=Math.min(min, comp);
		}
			return;	
		}
		else {
			for(int k=i;k<numbers.length;k++) {
				int temp=numbers[i];
				numbers[i]=numbers[k];
				numbers[k]=temp;
			
			findCombination(numbers, i+1, n);
			 temp=numbers[i];
			numbers[i]=numbers[k];
			numbers[k]=temp;
		}
	}
}}
