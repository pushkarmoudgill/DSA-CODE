package cpp;

import java.util.ArrayList;
import java.util.List;

public class ListEX {
	public static void main(String[] args) {
String s ="ABC";
char[] c=s.toCharArray();
System.out.println(c);
int idx=0;
//for(int i=idx;i<c.length;i++) {
	char temp=c[idx];
	c[idx]=c[1];
	c[1]=temp;
	String s2=c.toString();
	System.out.println(s2);
	String s1=new String (c);
	System.out.println(s1);
//}


	}

}
