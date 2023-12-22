package com.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class oddTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			// System.out.println(entry.getKey() + ": " + entry.getValue());
		if(entry.getValue()%2!=0) {
			System.out.println(entry.getKey());
		}
		}
	}
}