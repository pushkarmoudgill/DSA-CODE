package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSortPL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, LinkedList<Integer>> adjlist = new HashMap<>();

		for (int i = 0; i < n; i++) {
			adjlist.put(i, new LinkedList<>());
		}
		HashMap<Integer, Integer> inDegree = new HashMap<>();
		for (int i = 0; i < n; i++) {
			inDegree.put(i, 0);

		}

		for (int i = 0; i < m; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();
			inDegree.put(node2, inDegree.get(node2) + 1);
			adjlist.get(node1).add(node2);
		}

		//Queue<Integer> q = new LinkedList<>()
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] vis = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!vis[i] && inDegree.get(i)==0) {
			sort(i,vis,adjlist,stack);
			}}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}

//			while (!q.isEmpty()) {
//				int u = q.poll();
//				vis[u] = true;
//				System.out.print(u+" ");
//				for (Integer v : adjlist.get(u)) {
//					if (inDegree.get(v) > 0) {
//						inDegree.put(v, inDegree.get(v) - 1);
//					}
//					if (inDegree.get(v) == 0) {
//						q.add(v);
//					}
//				}
//
//			}

	}
	
	static void sort(int node,boolean[] vis,HashMap<Integer, LinkedList<Integer>> adjlist,Stack<Integer> stack ) {
		vis[node]=true;
		for(int i:adjlist.get(node)) {
			if(!vis[i]) {
				sort(i,vis,adjlist,stack);
			}
		}
		stack.push(node);
	}
}
