package com.graph.Revise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Rotten {
	public static void main(String [] args) {
		//int mat[][]= {{2,1,1},{0,1,1},{1,0,1}};
		int mat[][]= {{1},{2}};
		
		Queue<int []> queue=new LinkedList<>();
		
		int f=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]==2) {
					
					queue.offer(new int[] {i,j});
				}
				if(mat[i][j]==1) {
					f++;
				}
			}
		}
		if(f==0) {
			System.out.println(0);
			return;
		}
//		System.out.println(Arrays.deepToString(queue));
		//System.out.println(queue.size());
		
		int dx[]= {0,0,1,-1};
		int dy[]= {1,-1,0,0};
		int count=0;
		
		while(!queue.isEmpty()) {
			int size=queue.size();
			while(size>0) {
				int arr[]=queue.peek();
				//System.out.println("ARR"+Arrays.toString(arr));
//				int x=arr[0];int y=arr[1];
				queue.poll();
				
				for(int i=0;i<4;i++) {
					int x=arr[0];int y=arr[1];
//					queue.poll();
					x=x+dx[i];
					y+=dy[i];
					
					if(x<0||y<0||x>=mat.length||y>=mat[0].length||mat[x][y]==0||mat[x][y]==2) continue;
					
					mat[x][y]=2;
					queue.offer(new int[] {x,y});
					
				}
				
				size--;
			}
			if(queue.size()!=0) {
				count++;
			}
		}
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]==1) {
					
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
