package com.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AvoidCity {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int m=sc.nextInt();

int src=sc.nextInt();
int target=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
HashMap<Integer, LinkedList<Integer>> adjlist = new HashMap<>();

for (int i = 0; i < n; i++) {
	adjlist.put(i, new LinkedList<>());
}

for (int i = 1; i <= m; i++) {
	int node1 = sc.nextInt();
	int node2 = sc.nextInt();

	adjlist.get(node1).add(node2);
	adjlist.get(node2).add(node1);

}
Queue<Integer> queue = new LinkedList<>();
boolean[] visited = new boolean[n];
int[] distance = new int[n];
queue.add(src);
visited[src] = true;
distance[src] = 0;

while (!queue.isEmpty()) {
	int curr=queue.poll();
	
	LinkedList<Integer> list=adjlist.get(curr);
	
	for(int i=0;i<list.size();i++) {
		if(visited[list.get(i)]==false) {
			visited[list.get(i)]=true;
			if(arr[list.get(i)]==0) {
			queue.add(list.get(i));
			
			distance[list.get(i)] = distance[curr] + 1;
			if (list.get(i) == target) {
				System.out.println(distance[list.get(i)]);
				return;
			}
			
		}
	}
		
	}
	
	
}
System.out.println(-1);


}
}
