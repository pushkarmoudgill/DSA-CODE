package Contest;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="PSP";
		String p ="SPs";
		
		String pNew =p.toUpperCase();
		
		System.out.println(checkAna(s,pNew));
	}
	
		
	static 	boolean checkAna(String s, String p) {
		
		int freq [] =new int [26];
		
		for(int i=0;i<s.length();i++) {
			
			
			int val=s.charAt(i)-'A';
			
			freq[val]++;
			
			
		}
		
             for(int i=0;i<p.length();i++) {
			
			
			int val=p.charAt(i)-'A';
			
			freq[val]--;
			
			
		}
             
             for(int i=0;i<26;i++) {
            	 if (freq[i]!=0) {
            		 return false;
            	 }
            	 
             }
             return true;
		}
//		System.out.println(Arrays.toString(freq));

	

}
