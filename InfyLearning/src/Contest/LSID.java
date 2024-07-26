package Contest;

import java.util.Arrays;

public class LSID {
public static void main(String [] args) {
	int arr[]= {3,2,1};
	
	int iarr[]=new int [arr.length];
	
	for(int i=0;i<arr.length;i++) {
		iarr[i]=1;
	}
	
	int darr[]=new int [arr.length];
	
	for(int i=0;i<arr.length;i++) {
		darr[i]=1;
	}
	
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i+1]<arr[i]) {
			darr[i+1]=darr[i]+1;
		}
		else if(arr[i+1]>arr[i]){
			iarr[i+1]=iarr[i]+1;
			
		}
		else {
			iarr[i+1]=1;
			darr[i+1]=1;
		}
		
	}
	
	System.out.print(Arrays.toString(iarr));
	System.out.print(Arrays.toString(darr));
	int max=Integer.MIN_VALUE;
	for(int i=0;i<iarr.length;i++) {
		max=Math.max(max, iarr[i]);
	}
	int min=Integer.MIN_VALUE ;
	for(int i=0;i<darr.length;i++) {
		min=Math.max(min, darr[i]);
	}
	 
	if(max>=min) {
		System.out.println(max);
	}
	else {
		System.out.print(min);
	}
	
}
}
