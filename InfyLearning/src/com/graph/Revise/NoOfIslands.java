package com.graph.Revise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NoOfIslands {
	public static void main(String[] args) {
		//int n=4,m=5;
		int grid[][]= {{4,3,1},
				       {3,2,4},
			          {3},
				      {4},{}};
		int src=0;
		int dest=grid.length-1;
		System.out.println(grid.length);
		
		List<List<Integer>> mainlist=new ArrayList<>();
		
		List<Integer>  list =new ArrayList<>();
		
		boolean vis[]=new boolean[grid.length];
		
		dfs(src,grid,mainlist,list,dest,vis);
		
		System.out.println(mainlist);
	}
	
	
	static void dfs(int src,int [][]grid,List<List<Integer>> mainlist,List<Integer>list,int dest,boolean[] vis) {
		list.add(src);
		
		if(src==dest) {
			mainlist.add(new ArrayList<>(list));
			list.remove(list.size()-1);
			return;
		}
		
		
		for(int i:grid[src]) {
			
			if(vis[i]==false) {
				vis[src]=true;
			dfs(i,grid,mainlist,list,dest,vis);
			vis[src]=false;
			
			}
		}
		
		list.remove(list.size()-1);
	}
		
		
		
		
		
		
		
		
		
		
//		
//		HashMap<Integer,List<Integer>> adjlist=new HashMap();
//		
//		for(int i=0;i<grid.length;i++) {
//			adjlist.put(i, new ArrayList<>());
//		}
//		
//		for(int i=0;i<grid.length;i++) {
//			for(int j=0;j<grid[i].length;j++) {
//				
//				adjlist.get(i).add(grid[i][j]);
//			}
//		}
//		
//		System.out.println(adjlist);
//		
//		
//		
//		boolean vis[] =new boolean[grid.length];
//		
//		List<List<Integer>> ans=new ArrayList<>();
//		
//	List<List<Integer>> ans1=	dfs(adjlist,0,vis,ans,dest);
//	
//	System.out.println("aaaaa"+ans1);
//		
//		
//		
//		
//	}
//	
//	static List<List<Integer>> dfs(HashMap<Integer,List<Integer>> adjlist,int node,boolean [] vis,List<List<Integer>> ans,int dest){
//		
//		
//		///vis[node]=true;
//		
//		
//		
//		
//		
//		if(node==dest) {
//				ans.add(list);
//				return ans;
//			
//		}
//		
//		
//		for(int i=0;i<adjlist.get(node).size();i++) {
//			List<Integer> list=new ArrayList<>();
//			list.add(node);
//			if(vis[adjlist.get(node).get(i)]==false) {
//				int curr=adjlist.get(node).get(i);
//				list.add(curr);
//				vis[node]=true;
//				dfs(adjlist,curr,vis,ans,dest);
//				vis[node]=false;
//			}
//		}
//		return ans;
//	}

	}
