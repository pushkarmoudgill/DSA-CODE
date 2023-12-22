package com.rwork;

import java.util.ArrayList;

public class TestList {
	
	public static void main(String args[]) {
		int n=4;
        int[][] arr={{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};

		
		ArrayList<ArrayList<Pair>> list=new  ArrayList<ArrayList<Pair> >();
		
		for(int i=0;i<n;i++ ) { //
			list.add(new ArrayList< Pair>());
		}
		
		for(int i=0;i<arr.length;i++) {
			list.get(arr[i][0]).add(new Pair(arr[i][1],arr[i][2]));
		}
		  for (int i = 0; i < list.size(); i++) { 
	            for (int j = 0; j < list.get(i).size(); j++) { 
	                System.out.print(list.get(i).get(j).first + " "); 
	            } 
	            System.out.println(); 
	        } 
		
	}
	
	
	static class Pair{
		int first;int second;
		
		Pair(int first,int second){
			this.first=first;
			this.second=second;
		}
	}

}
