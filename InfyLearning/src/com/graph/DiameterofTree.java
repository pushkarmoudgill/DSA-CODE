package com.graph;


	import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

	public class DiameterofTree {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			//int x= sc.nextInt();
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
			int[] length=new int[n+1];
			dfs(1,adjlist,length);
			System.out.println(Arrays.toString(length));
			
			
	}
		
		public static int dfs(int node,HashMap<Integer, LinkedList<Integer>> adjlist,int[]length) {
			int distance=0;
			int max=0;
			for(Integer i:adjlist.get(node)) {
				int a=dfs(i,adjlist,length);
				max=Math.max(a, max);
				distance=max+1;
						
				//
				}
			length[node]=distance;
			
			return distance;
		}
	
}
