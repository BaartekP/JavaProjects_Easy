
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class perfectlBalancedBonus {

	Scanner scan = new Scanner(System.in);
	
	public void checkBalance() {
		
		System.out.print("\n");
		boolean resoult = true;
		
		String a = scan.next();
		char[] chars = a.toCharArray();
		
		List<Character> symbols = new ArrayList<>();
		symbols.add(chars[0]);
		
		//System.out.print(symbols.get(0));		
		
		for(int i=0;i<chars.length;i++) {
			if(symbols.indexOf(chars[i])==-1)
				symbols.add(chars[i]);
		}
		
		int[] count = new int[symbols.size()];
		
		for(int j=0;j<symbols.size();j++) {
			for(char x : chars) {
				if(symbols.get(j)==x)
					count[j]++;
			}
		}
		
		int temp = count[0];
		for(int i=0;i<symbols.size();i++) {
			if(temp!=count[i]) {
				resoult=false;
				break;
			}
		}
		
		for(int i=0;i<symbols.size();i++) {
			System.out.print(symbols.get(i)+" : "+count[i]+"\n");
		}
			
		System.out.print(resoult);
		
	}
	
	
}
