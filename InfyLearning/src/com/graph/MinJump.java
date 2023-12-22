package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinJump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, LinkedList<Integer>> adjlist = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			adjlist.put(i, new LinkedList<>());
		}

		for (int i = 1; i <= m; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();

			adjlist.get(node1).add(node2);
			adjlist.get(node2).add(node1);

		}

//System.out.println(Arrays.asList(adjlist));

		int src = sc.nextInt();
		int dest = sc.nextInt();

		Queue<Integer> adjacent = new LinkedList<>();
		boolean[] visited = new boolean[n + 1];
		int[] distance = new int[n + 1];
		adjacent.add(src);
		visited[src] = true;
		distance[src] = 0;
		while (!adjacent.isEmpty()) {
			int curr = adjacent.poll();

			for (int i = 0; i < adjlist.get(curr).size(); i++) {
				if (visited[adjlist.get(curr).get(i)] == false) {
					adjacent.add(adjlist.get(curr).get(i));
					visited[adjlist.get(curr).get(i)] = true;
					int listElement = adjlist.get(curr).get(i);
					distance[listElement] = distance[curr] + 1;
					if (listElement == dest) {
						System.out.println(distance[listElement]);
						return;
					}
				}
			}
		}
		System.out.println(0);

	}
}