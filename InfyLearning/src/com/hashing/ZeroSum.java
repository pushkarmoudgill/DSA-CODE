package com.hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZeroSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		 Set<Integer> hs = new HashSet<Integer>();
		 
	        int sum = 0;
	 
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	 
	            
	            if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
	                System.out.println("Yes");
	return;
	            }
	            // Add sum to hash set
	            hs.add(sum);
}
	        System.out.println("No");
	        
}
}