package com.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class JoinStick {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
	 
	        
	        int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<n;i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		int ans=0;
		while(pq.size()>1){
			
			int stick1=pq.poll();
			int stick2=pq.poll();
			
			int sum=stick1+stick2;
			ans+=sum;
			
			
			pq.add(sum);
			
			
		}
		
		System.out.println(ans);
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		
		
		
		
	}
}
