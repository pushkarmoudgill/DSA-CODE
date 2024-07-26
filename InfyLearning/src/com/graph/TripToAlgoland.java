package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class TripToAlgoland {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		Map<String,List<String>> mapp=new HashMap<>();
		
	Map<String, Integer> vis = new HashMap<>();
	for(int i=0;i<m;i++) {
		
		
	String a=sc.next();
	String b=sc.next();
	String c=sc.next();
	if(!vis.containsKey(a)) {
		vis.put(a,0);
	}
	if(!vis.containsKey(b)) {
		vis.put(b,0);
	}
	
	if(mapp.containsKey(a)) {
		mapp.get(a).add(b);
		mapp.get(a).add(c);
	}else {
	mapp.put(a,new ArrayList<>());
	
	mapp.get(a).add(b);
	mapp.get(a).add(c);
	}
	


}
	String src=sc.next();
	String dest=sc.next();
	int count=0;
	Queue<String> queue = new LinkedList<>();
	List<String> road=new ArrayList<>();
	queue.add(src);
	vis.put(src,1);
	
	
	
	while(!queue.isEmpty()) {
		String curr=queue.poll();
		if(mapp.containsKey(curr)) {
		for(int i=0;i<mapp.get(curr).size();i+=2) {
			if(vis.get(mapp.get(curr).get(i))==0) {
				String inMap=mapp.get(curr).get(i);
				queue.add(inMap);
				vis.put(inMap,1);
				
				road.add(mapp.get(curr).get(i+1));
				count++;
				if(inMap.equals(dest)) {
					System.out.println(count);
					System.out.println();
					for(String res:road) {
						System.out.println(res);
					}
					return;
				}
			}
			
			
		}
		}
		
	}
	System.out.print("Impossible");

}
}
