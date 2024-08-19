package com.dp;

public class CoinChange1 {
public static void main(String [] args) {
	int coin [] = {1,2,3};
	
	int sum =5;
	
	
	int ans=count(sum,coin,0);
	
	System.out.println(ans);
}


static int count (int sum,int [] coin,int i) {
	
	
	if(sum==0) {
		return 1;
		}
	
	if(sum<0 || i==coin.length) {
		return 0;
	}
	int cnt=0;
	 cnt+= count (sum-coin[i],coin,i);
	cnt+=count(sum,coin,i+1);
	
	return cnt;
}
}
