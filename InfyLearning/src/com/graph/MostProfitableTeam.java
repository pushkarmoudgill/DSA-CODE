package com.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class MostProfitableTeam {
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	//int c=sc.nextInt();
	HashMap<Integer, LinkedList<Integer>> adjlist = new HashMap<>();

	for (int i = 1; i <= n; i++) {
		adjlist.put(i, new LinkedList<>());
	}
	
	for (int i = 2; i <= n; i++) {
		int node1 = sc.nextInt();
		//int node2 = sc.nextInt();

		adjlist.get(node1).add(i);
		

	}
	
	int profit[]=new int[n+1];
	for(int i=1;i<n+1;i++) {
		profit[i]=sc.nextInt();
	}
	
	boolean[] vis=new boolean[n+1];
	
	int max=0;
	//int ans=0;
	int ans[]=new int [n+1];
	int a=fun(1,vis,max,adjlist,profit,ans);
	
//	for(int i=0;i<ans.length;i++) {
//		max=Math.max(ans[i], max);
//	}
	System.out.println(a);
	}
	
	public static  int  fun(int node,boolean[] vis,int max,HashMap<Integer,
			LinkedList<Integer>> adjlist,int [] profit,int [] ans) {
		vis[node]=true;
		int value=profit[node];
		
		for(Integer neighbour:adjlist.get(node)) {
			if(!vis[neighbour]==true) {
				int ReturnValue= fun(neighbour,vis,max,adjlist,profit,ans);
				value+=ReturnValue;
				
			}
		}
		max=Math.max(max, value);
		
		return value;
	}
	//System.out.println(adjlist);
	
}
