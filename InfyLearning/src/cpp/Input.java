package cpp;

import java.util.Scanner;

public class Input {
	public   static String reverse(String str) {
		String r="";
		for(int i=str.length()-1;i>=0;i--) {
			r=r+str.charAt(i);
		}
		return r;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			String s=sc.nextLine();
			String rev=reverse(s);
			if (s.equals(rev)) {
			
				System.out.println("Yes");
		    }
		    else {
		    	System.out.println("No");
		    }
	}
}
}