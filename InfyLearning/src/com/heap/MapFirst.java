package com.heap;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapFirst {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		int[][] res = new int[map.size()][2];
		int i = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			res[i][0] = e.getKey();
			res[i][1] = e.getValue();
			i++;
		}
		Arrays.sort(res, (a, b) -> {
			if (a[1] == b[1])
				return a[0] - b[0];
			else
				return b[1] - a[1];
		});
		for (int j = 0; j < k; j++) {
			System.out.print(res[j][0] + " ");
		}
	}

}