package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Dfs1 {
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
	boolean[] vis=new boolean[n+1];
	int ans[] =new int [n+1];
	
    dfs(1,vis,adjlist,ans);
    
    for(int i=1;i<ans.length;i++) {
    	System.out.print(ans[i]+" ");
    }
	
//System.out.println(adjlist);
	

}

public static int dfs(int node,boolean[] vis,HashMap<Integer, LinkedList<Integer>> adjlist,int []res) {
	int sum=1;
	vis[node]=true;
	
	for(Integer neighbour:adjlist.get(node)) {
		if(!vis[neighbour]==true) {
			int res1 = dfs(neighbour,vis,adjlist,res);
			sum+=res1;
		}
	}
	res[node]=sum-1;
	return sum;
}
}
