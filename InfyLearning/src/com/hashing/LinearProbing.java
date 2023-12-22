package com.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class LinearProbing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m =sc.nextInt();
		int[] arr1 = new int[n];
		
		int [] arr2 =new int[m];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < m; i++) {
			arr2[i] = -1;
		}
		
		for(int i=0;i<n;i++) {
			int x=arr1[i]%m;
			int temp=x;
			
				while(arr2[x]!=arr1[i]) {
					if(arr2[x]==-1) {
						arr2[x]=arr1[i];
						break;
					}
					else {
					x++;
					if(x==m) {
						x=0;
					}
					if(x==temp)
					{
						break;
					}
					
				}
				}
				

			}
		
		System.out.println(Arrays.toString(arr2).replace("[", "").replace("]", " ").replace(",", ""));

	}
}
