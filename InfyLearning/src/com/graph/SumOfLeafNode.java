package com.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumOfLeafNode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x= sc.nextInt();
		HashMap<Integer, LinkedList<Integer>> adjlist = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			adjlist.put(i, new LinkedList<>());
		}

		for (int i = 1; i <= n-1; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();

			adjlist.get(node1).add(node2);
			//adjlist.get(node2).add(node1);

		}
		//System.out.println(adjlist);
		int sum=0;
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[n + 1];
		queue.add(1);
		visited[1]=true;
		
		while(!queue.isEmpty()) {
			
			int curr=queue.poll();
			if(adjlist.get(curr).size()==0) {
				sum+=curr;
			}
			
		for(int i=0;i<adjlist.get(curr).size();i++) {
			int element =adjlist.get(curr).get(i);
			if(visited[element]==false) {
				queue.add(element);
				visited[element]=true;
			}
		}
			
		}
		if(sum>=x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
}
}