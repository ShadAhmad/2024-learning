package corejavabasics;
import java.util.Scanner;

public class DecimalBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a binary number: ");
		StringBuilder binary = new StringBuilder(sc.nextLine());
		sc.close();
		
		int size = binary.length();
		
		int decimal = 0;
		
		for(int i=0; i<size; ++i) {
			String bit = "" + binary.charAt(i);
			decimal += Integer.parseInt(bit) * Math.pow(2, size-i-1);
		}
		
		System.out.println("Decimal number is " + decimal);
		
		StringBuilder newBinary = new StringBuilder("");

		while(decimal != 0) {
			newBinary.append(decimal % 2);
			decimal = decimal / 2;
		}

		newBinary.reverse();
		System.out.println("Binary number is " + newBinary);
		
		System.out.println("Binary is equal to New Binary: " + binary.toString().equals(newBinary.toString()));
	}
}