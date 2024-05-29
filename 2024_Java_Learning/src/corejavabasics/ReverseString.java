package corejavabasics;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		sc.close();
		
		char temp = ' ';
		for(int i=0; i<sb.length()/2; ++i) {
			int indexEnd = sb.length()-i-1;
			temp = sb.charAt(indexEnd);
			sb.setCharAt(indexEnd, sb.charAt(i));
			sb.setCharAt(i, temp);
		}
		
		System.out.println(sb);
	}
}