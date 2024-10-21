package com.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class consecutiveNumber {
	public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int max=Integer.MIN_VALUE;

	int conNum=0;
	for(int i=0;i<arr.length-1;i++) {
		int sub=arr[i+1]-arr[i];
		if(sub==1)  {
			conNum++;
		}
      else  if(sub==0)  {
			//conNum++;
		}
       else  if(sub<0)  {
			//conNum++;
		}
		else {
			///break;
            max=Math.max(max,conNum+1);
            conNum=0;
		}
	}
    if(max<=conNum){
        //return conNum +1;
    	System.out.println(conNum +1);
    }
else{
	System.out.println(max);
}
}
}
//[-8,-4,9,9,4,6,1,-4,-1,6,8]


// t.c. : 11
//-8 -4 9 9 4 6 1 -4 -1 6 8