package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceSeater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
	int 	n=2*n1;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		//int sum=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int sum=0;
				//for(int k=0;k<n-1;k+=2) {
				int k=0;
				while(k<n-1)
				{
					int sub=0;
					
					if(k!=i&&k!=j) {
						if(k+1 == j && k+1!=n-1) {
					 sub=arr[k+2]-arr[k];
					 k+=2;
					}
						else {
							 sub=arr[k+1]-arr[k];
							 k+=1;
						}
					}
					
					sum=sum+sub;
					k+=1;
				}
				
				min=Math.min(min, sum);
			}
		}
		
		System.out.println(min);
		
}
}