
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class perfectlBalancedBonus {

	Scanner scan = new Scanner(System.in);
	
	public void checkBalance() {
		
		//user input
		String a = scan.next();
		char[] chars = a.toCharArray();
		
		
		List<Integer> count = new ArrayList<>();
		List<Character> symbols = new ArrayList<>();
		if(chars.length!=0) symbols.add(chars[0]);	
		
		for(int i=1;i<chars.length;i++) {
			for(int j=0;j<symbols.size();j++) {
				 if(symbols.indexOf(j)!=chars[i]) {
					 symbols.add(chars[i]);
					 System.out.print(chars[i]);
				 }
					 
					 
			}
		}
		
		
		
		
			
		
		
	}
	
	
}
