package com.dpContest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeSearch {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int t = Integer.parseInt(br.readLine());
		
		
		for(int z=0;z<t;z++) {
			 int n = Integer.parseInt(br.readLine());
		      String s = br.readLine();
			
			if(s.length()==1) {
				System.out.println(s);
				return;
			}
			int dp[][]=new int [n][n];
			int start =0;
			
			List<Integer> list =new ArrayList<>();
			int len=1;
			
			
			for(int k=0;k<n;k++) {
				dp[k][k]=1;
			}
			
			for(int k=0;k<n-1;k++) {
				if(s.charAt(k)==s.charAt(k+1)) {
					dp[k][k+1]=1;
					start =k;
					list.add(k);
					
					len=2;
				}
			}
			
			for(int k=3;k<=n;k++) {
				for(int l=0;l<n-k+1;l++) {
					
					int j=l+k-1;
					
					if(s.charAt(l) ==s.charAt(j)&&dp[l+1][j-1]==1) {
						dp[l][j]=1;
						
						if(k>len) {
							len=k;
							start =l;
									list.clear();
									list.add(l);
						}
						else if(k==len) {
							len=k;
							list.add(l);
						}
					}
				}
				
			}
			
			String ans=s.substring(list.get(0), list.get(0)+len);
			
			for(int i=1;i<list.size();i++) {
				String str=s.substring(list.get(i),list.get(i)+ len);
				
				int val=ans.compareTo(str);
				
				if(val>0) {
					ans=str;
				}
			}
			
			System.out.println(ans);
			
		}
		
		
		
		
	}
}

