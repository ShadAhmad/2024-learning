package corejavabasics;
import java.util.Scanner;

public class BitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter the bit to fetch: ");
		int bit = sc.nextInt();
		
		int position = bit - 1;
		int bitMask = 1 << position;
		
		int result = bitMask & number;
		
		if(result == 0)	System.out.println("Bit " + bit + " is 0");
		else System.out.println("Bit " + bit + " is 1");
		
		System.out.print("Enter the bit to set: ");
		bit = sc.nextInt();
		
		position = bit-1;
		bitMask = 1 << position;		
		
		result = bitMask | number;
		System.out.println("Resulting number is " + result);		

		System.out.println("\nNumber: " + number);
		System.out.print("Enter the bit to clear: ");
		bit = sc.nextInt();
		
		position = bit-1;
		bitMask = 1 << position;
		
		result = ~bitMask & number;
		System.out.println("Resulting number is " + result);
		
		sc.close();
	}
}