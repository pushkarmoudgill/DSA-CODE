package com.opps;

class out{
	private boolean b =false;
	
	private int i;
	
	out(int i){
		this.i=i;
	}
	

	
	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}



	boolean m() {
		return b;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		out ob =new out(1);
	//	ob.g(true);
		System.out.println(ob.m());
		

		
	}

}
