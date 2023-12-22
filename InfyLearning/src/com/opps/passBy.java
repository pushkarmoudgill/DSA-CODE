package com.opps;


class outerClass{
	String str;
	int i;
	
    int callByValue(int t, String s) {
    	return 1;
    }
    
    
    float callByReference(outerClass cal
    		) {
    	cal.i=223;
    	return 1.2f;
    }
}
public class passBy {
public static void main(String [] args) {
	outerClass c =new outerClass();
	outerClass c1 =new outerClass();

	c.callByValue(3, "qwe");
	c.callByReference(c1);
}
}
