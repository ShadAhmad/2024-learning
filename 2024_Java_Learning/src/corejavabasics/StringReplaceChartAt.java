package corejavabasics;
import java.util.Scanner;

public class StringReplaceChartAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
	
		//String result = str.replace('e', 'i');
		
		String result = "";
		for(int i=0; i<str.length(); ++i) {
			if(str.charAt(i) == 'e')	result += 'i';
			else	result += str.charAt(i);
		}
		
		System.out.println("Result: " + result);
		
		System.out.print("Enter an email: ");
		String email = sc.nextLine();		
		sc.close();
		
		String username = "";
		
		for(int i=0; i<email.length(); ++i) {
			if(email.charAt(i) == '@')	break;
			username += email.charAt(i);
		}
		
		System.out.println("UserName: " + username);
	}
}