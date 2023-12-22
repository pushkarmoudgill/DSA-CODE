package com.graph;

import java.util.ArrayList;

public class DirectedCyclic {
	static class Edge{
		int src;
		int dest;
		Edge(int src,int dest){
			this.src=src;
			this.dest=dest;
		}
	}
	static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<Edge>();
			
		}
		graph[0].add(new Edge(0,1));
		graph[1].add(new Edge(2,1));
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(4,2));
		
	}
	public static boolean isCycle(ArrayList<Edge> graph[],boolean [] vis,boolean[] rec,int curr) {
		
		vis[curr]=true;
		rec[curr]=true;
		
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(rec[e.dest]) {
				return true;
			} else if(!vis[e.dest] &&isCycle(graph, vis, rec, e.dest) ) {
				///if(isCycle(graph, vis, rec, e.dest)) {
					return true;
				
			}
		}
		rec[curr]=false;
		return false;
		
	}
	
public static void main(String [] args) {
	int v=5;
	ArrayList<Edge> graph[]=new ArrayList[v];
	
	createGraph(graph);
	boolean vis[]=new boolean[v];
	boolean st[]=new boolean[v];
	for(int i=0;i<v;i++) {
	if(vis[i]==false) {
	
		boolean c= isCycle(graph, vis, st, 0);
	
	if(c) {
		System.out.println(c);
		break;
	}
	}
	
}
}}
