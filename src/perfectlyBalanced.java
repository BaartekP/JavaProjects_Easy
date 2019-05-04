
import java.util.Scanner;


public class perfectlyBalanced {

	
	Scanner scan = new Scanner(System.in);
	
	public void checkBalancy() {
	
	//user input
		System.out.print("\nGive a string of characters (only x and Y)\n");
		String a = scan.next();
	
	//arrays of chars and to count		
		int[] count = {0,0};
		char[] chars = a.toCharArray();
	
	//counting
		for(int i=0;i<chars.length;i++) {
			if(chars[i]=='x') {count[0]+=1;}
			else {count[1]+=1;}
		}
		
	//result
		boolean x =false;
		if(count[0]==count[1]) {x = true;}
		
		System.out.print("X = "+ count[0]+"\tY = "+count[1]+"\t "+ x);
		
		
		
	}
}
