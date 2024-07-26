package Contest;

public class keychange {
public static void main(String [] args) {

//	// logic for compare two character 
//	char a='Z';
//	char A='z';
//	if((int)a+32==(int)A||(int)a-32==(int)A) {
//		System.out.println("T");
//	}
//	else {
//		System.out.println("F");
//	}

	
	String s="aAbBcC";
	int count =0;
	for(int i=0;i<s.length()-1;i++) {
		char a=s.charAt(i);
		char A=s.charAt(i+1);
		
		if((int)a+32==(int)A||(int)a-32==(int)A||(int)a==(int)A) {
			
	}
	else {
		count++;
	}
		
	}
	System.out.println(count);
	
}
}
