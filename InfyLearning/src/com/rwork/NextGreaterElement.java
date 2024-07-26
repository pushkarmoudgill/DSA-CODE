package com.rwork;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElement {
	public static void main(String [] args) {
	Scanner sc=new Scanner (System.in);
  //  int n=sc.nextInt();
	
	int n=4321;
    
    String str = Integer.toString(n);
    
   
   

   
int  [] arr = new int[str.length()];


for (int i = 0; i < str.length(); i++)
{
    arr[i] = str.charAt(i) - '0';
}
    System.out.print(Arrays.toString(arr));
    
    int nextGreater=0;
    for(int i=0;i<arr.length-1;i++) {
    	for(int j=i+1;j<arr.length;j++) {
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    	
    	 System.out.print(Arrays.toString(arr));
    	 StringBuilder builder = new StringBuilder();
    	  for (int num : arr) {
    	   builder.append(num);
    	  }
    	  int number = Integer.parseInt(builder.toString());
    	  
    	  if(number>n) {
    		  nextGreater=Math.max(nextGreater, number);
    	  }
            arr    =	  swap(arr,i,j);
            
            
    	
    	
    	
    	}
    }
    
 
//    

}
	
	 static int[] swap(int [] arr ,int i,int j) {
//	    	for()
		 
		 int temp=arr[i];
	    	arr[i]=arr[j];
	    	arr[j]=temp;
	    		
	    		return arr;
	    }
}