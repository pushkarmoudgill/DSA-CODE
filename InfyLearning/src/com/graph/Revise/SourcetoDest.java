package com.graph.Revise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SourcetoDest {
	public static void main(String [] agrs) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();
		
		HashMap<Integer,List<Integer>> adjlist=new HashMap();
		
		for(int i=1;i<=n;i++) {
			adjlist.put(i, new ArrayList<>());
		}
		
		for(int i=1;i<=m;i++) {
			int node1=sc.nextInt();
			int node2=sc.nextInt();
			adjlist.get(node1).add(node2);
			adjlist.get(node2).add(node1);
			
		}
		
		//System.out.print(adjlist);
		
		int src=sc.nextInt();
		int destination=sc.nextInt();
		
	Queue<Integer> queue=new LinkedList<>();
	
	int [] dis=new int[n+1];
	boolean [] vis=new boolean[n+1];
	
	queue.add(src);
	vis[src] = true;
	dis[src] = 0;
	
	while(!queue.isEmpty()) {
		
		int curr=queue.poll();
		for(int i=0;i<adjlist.get(curr).size();i++) {
			if(vis[adjlist.get(curr).get(i)]==false) {
				queue.add(adjlist.get(curr).get(i));
				vis[adjlist.get(curr).get(i)]=true;
				
				dis[adjlist.get(curr).get(i)]=dis[curr]+1;
				
				if(adjlist.get(curr).get(i)==destination) {
					System.out.print(dis[adjlist.get(curr).get(i)]);
					return;
				}
				
			}
		}
		
	}
	System.out.println("0");
		
	}

}
