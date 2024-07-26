package com.graph.Revise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Snowflakes {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		HashMap<Integer,List<Integer>> adjlist=new HashMap();
		HashMap<Integer,Integer> map=new HashMap();
		for(int i=1;i<=n;i++) {
			adjlist.put(i, new ArrayList<>());
		}
		
		for(int i=1;i<=m;i++) {
			int node1=sc.nextInt();
			int node2=sc.nextInt();
			adjlist.get(node1).add(node2);
			adjlist.get(node2).add(node1);
			
		}
		
		
	//	System.out.println(adjlist);
		
	  boolean vis[] =new boolean[n+1];
	  
	  for(int i=1;i<=n;i++) {
		  if(adjlist.get(i).size()!=1) {
			  
			  // It may be beautiful snowflake so its value put true
			  boolean bea=true;
			  for(int j=0;j<adjlist.get(i).size();j++) {
				  int node=adjlist.get(i).get(j);
				  
				  if(adjlist.get(node).size()!=1) {
					  bea=false;
					  break;
				  }
				  
			  }
			  if (bea==true) {
				  if(map.containsKey(adjlist.get(i).size())){
					  map.put(adjlist.get(i).size(), map.get(adjlist.get(i).size())+1);
				  }
				  else {	  
				  map.put(adjlist.get(i).size(), 1);
				  }
			  }
			  
		  }
	  }
	  
	 // System.out.println(map);
	  int count=0;
	  
	  for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
		  
		  if(entry.getValue()==1) {
			  count++;
		  }
		  
	  }
	  System.out.println(count);
	}

}
