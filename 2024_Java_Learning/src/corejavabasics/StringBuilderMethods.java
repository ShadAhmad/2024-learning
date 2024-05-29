package corejavabasics;
import java.util.Scanner;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		sc.close();
		
		System.out.println(sb);
		
		sb.append(" Jaidi, ");
		sb.append(29);
		System.out.println(sb);
		
		sb.setCharAt(11, 'Z');
		System.out.println(sb);
		
		sb.insert(0, "Mr. ");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}