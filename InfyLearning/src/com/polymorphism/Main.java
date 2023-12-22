package com.polymorphism;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num;
num=sc.nextInt();


String S[]=new String[num];
for(int i=0;i<num;i++){
  S[i]=sc.next();
}

  for(int i=0;i<S.length;i++){
	  String rev="";
    for(int j=S[i].length()-1;j>-1;j--) {
    	String s=S[i];
    	rev+=s.charAt(j);

    
    }
    if(S[i].equals(rev)) {
    	System.out.println("Yes");
    }
    else {
    	System.out.println("No");
    }
  }
    //System.out.println("Hello World");

  }
}