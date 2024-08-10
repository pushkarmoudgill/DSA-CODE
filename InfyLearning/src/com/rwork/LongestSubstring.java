package com.rwork;

public class LongestSubstring {
	
	
	public static void main(String [] args) {
		String str="asdfgbbbbb";
		
		
	int ans=	find(str);
	System.out.println(ans);
	}
	
	static int  find (String str) {
		if (str.length()==0) {
			return 0;
			
		}
		
		 	if (str.length()==1) {
			return 1;
			
		}
		
		int maxLength=0;
		
		
	  boolean vis[]=new boolean[256];
	  
	  int l=0,r=0;
	  
	  while(r<str.length()) {
		  
		 if (vis[str.charAt(r)]) {

              // The left pointer moves to the right while
              // marking visited characters as false until
              // the repeating character is no longer part
              // of the current window.
              while (vis[str.charAt(r)]) {

                  vis[str.charAt(l)] = false;
                  l++;
              }
          }
		  
			System.out.print(str.charAt(r));

		  vis[str.charAt(r)]=true;
		  
		  maxLength=Math.max(maxLength, r-l+1);
		  
		  r++;
		  
		  
	  }
		return maxLength;
	}

}
