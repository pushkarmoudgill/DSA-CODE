package com.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class NodesofShortestpath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m= sc.nextInt();
		HashMap<Integer, LinkedList<Integer>> adjlist = new HashMap<>();

		for (int i = 1; i <= m; i++) {
			adjlist.put(i, new LinkedList<>());
		}

		for (int i = 1; i <= m; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();

			adjlist.get(node1).add(node2);
			adjlist.get(node2).add(node1);

		}
		//System.out.println(adjlist);
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[n + 1];
		int[] distance = new int[n + 1];
		queue.add(1);
		visited[1] = true;
		distance[1] = 0;
		while (!queue.isEmpty()) {
			int curr = queue.poll();

			for (int i = 0; i < adjlist.get(curr).size(); i++) {
				if (visited[adjlist.get(curr).get(i)] == false) {
					queue.add(adjlist.get(curr).get(i));
					visited[adjlist.get(curr).get(i)] = true;
					int listElement = adjlist.get(curr).get(i);
					distance[listElement] = distance[curr] + 1;
					
				}
			}
			
		}
		int distance2[]=new int[n+1];
		Queue<Integer> queue1 = new LinkedList<>();
		boolean[] visited1 = new boolean[n + 1];
		queue1.add(n);
		visited1[n] = true;
		distance2[n] = 0;
		while (!queue1.isEmpty()) {
			int curr = queue1.poll();

			for (int i = 0; i < adjlist.get(curr).size(); i++) {
				if (visited1[adjlist.get(curr).get(i)] == false) {
					queue1.add(adjlist.get(curr).get(i));
					visited1[adjlist.get(curr).get(i)] = true;
					int listElement = adjlist.get(curr).get(i);
					distance2[listElement] = distance2[curr] + 1;
					
				}
			}
			
		}
//		Arrays.sort(distance);
//		Arrays.sort(distance2);
		
//		System.out.println(Arrays.toString(distance));
//		System.out.println(Arrays.toString(distance2));
//		
		int destDistance=distance[n];
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<n+1;i++) {
			int dist=distance[i]+distance2[i];
			if(dist==destDistance) {
				list.add(i);
			}
		}
		Collections.sort(list);
			System.out.println(list);
}
}
