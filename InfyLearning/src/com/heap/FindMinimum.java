package com.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class FindMinimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			int input1 = sc.nextInt();
			if (input1 == 1) {
				pq.add(sc.nextInt());
			}
			else {
				System.out.println(pq.poll());
			}

		}

	}
}
