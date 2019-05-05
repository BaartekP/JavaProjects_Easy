
import java.util.Scanner;

public class HexColors {
	
	Scanner scan = new Scanner(System.in);
	
	public void changeToHex() {
		
		System.out.print("\nValues must be between 0 and 255");

		System.out.print("\nR : ");
		int r = scan.nextInt();
		System.out.print("G : ");
		int g = scan.nextInt();
		System.out.print("B : ");
		int b = scan.nextInt();
		
		String a = "";
		a+=calc(r);
		a+=calc(g);
		a+=calc(b);	
		
		a='#'+a;
		
		System.out.print(a);
	}
	
	public String checkRest(int x) {
	String hex ="";
	if(x>9) {
		switch(x) {
		case 10:
			hex = "A";
			break;
		case 11:
			hex = "B";
			break;
		case 12:
			hex = "C";
			break;
		case 13:
			hex = "D";
			break;
		case 14:
			hex = "E";
			break;
		case 15:
			hex = "F";
			break;
		}
	}else
		return String.valueOf(x);
	
	return hex;
	}
	
	public String calc(int x) {
		String a = "";
		int x_1;
		int temp = x;
		do {
			x_1 = x%16;
			x = x/16;		
			a = checkRest(x_1)+a;
			
		}while(x!=0);
		if(temp<16)
			a = "0"+a;
		return a;
	}
}
