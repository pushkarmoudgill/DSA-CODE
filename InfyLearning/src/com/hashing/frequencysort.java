package com.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencysort {
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
		int[][] arr = new int[map.size()][2];
		int i = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			// System.out.println(entry.getKey() + ": " + entry.getValue());
			arr[i][0] = entry.getKey();
			arr[i][1] = entry.getValue();
			i++;
		}

//		for(int i1=0;i1<map.size();i1++) {
//		for(int j=0;j<2;j++) {
//System.out.print(arr[i1][j]+" ");
//		}
//		System.out.println();
//	}
		// Arrays.sort(arr, (a, b) -> Integer.compare(a[1],b[1]));
		Arrays.sort(arr, (a, b) -> {
			if (a[1] == b[1])
				return a[0] - b[0];
			else
				return b[1] - a[1];
		});
		for (int i1 = 0; i1 < map.size(); i1++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i1][j] + " ");
			}
			System.out.println();
		}

		for (int k = 0; k < arr.length; k++) {
			while (arr[k][1] > 0) {

				System.out.print(arr[k][0] + " ");
				arr[k][1]--;
			}
		}
	}
}