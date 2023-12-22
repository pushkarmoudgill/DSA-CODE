package com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class piles {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int h=sc.nextInt();
	double[] arr=new double[n];
	int  max=Integer.MIN_VALUE;
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextDouble();
		 max=(int) Math.max(arr[i],max);
	}
	//Arrays.sort(arr);
	//int  max=Integer.MIN_VALUE;
//	for(int i=0;i<arr.length;i++){
//	  max=(int) Math.max(arr[i],max);
//	}
//Arrays.sort(arr);
//int max=arr.length-1;

long l=1;long r=(long) 1e9;
while(l+1<r) {
	long mid=l+(r-l)/2;
	if(Pred(mid,arr,h)==0) {
		l=mid;
	}else {
		r=mid;
	}
}
System.out.println(r);


}

private static int Pred(long mid,double[] arr,int h) {
	int no_of_operation=0;
	int a=0;
	for(int i=0;i<arr.length;i++) {
		no_of_operation+=Math.ceil(arr[i]/mid);

	}
	if(no_of_operation<=h) {
		return 1;
	}
	else {
	return 0;
	}
	
}
}
