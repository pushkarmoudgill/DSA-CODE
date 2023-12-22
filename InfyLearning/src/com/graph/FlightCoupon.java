package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class FlightCoupon {
	static class Edge{
		int src;int dest;int wt;
		Edge(int src,int dest, int wt){
			this.src = src;
			this.dest=dest;
			this.wt=wt;
		}
	}
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int  m=sc.nextInt();
	
	ArrayList <Edge>graph=new ArrayList<>(n);
	ArrayList <Edge>graph2=new ArrayList<>(n);

	//ArrayList <Edge>graph2[]=new ArrayList[n+1];
	
//	for(int i=1;i<n+1;i++) {
//		graph.addAll(i, new ArrayList<>());
//		graph2.addAll(i, new ArrayList<>());
//	}
	
	for(int i=1;i<=m;i++) {
		int s=sc.nextInt();
		int d=sc.nextInt();
		int w=sc.nextInt();
		
		graph.add(new Edge(s, d, w));
		//graph2.add(i,new Edge(d,s,w));

	//	graph2[d].add(new Edge(d,s,w));

	}
//	for(int i=m;i>0;i--) {
//		int s=sc.nextInt();
//		int d=sc.nextInt();
//		int w=sc.nextInt();
//		
//		graph2[d].add(new Edge(d, s, w));
//
//	}
System.out.println((graph));  
	
	
	
	
}
}
