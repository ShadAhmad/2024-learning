package corejavabasics;
import java.util.Scanner;

public class BitManipulationRelated {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		sc.close();
		
		System.out.println("Checking whether number is power of 2 or not");
		//Number will be power of 2, if number of bit as 1 is only once in the number
		//We'll fetch right-most index bit value and keep right-shifting number until it's 0
		//If count of right-most bit as 0 comes exactly 1 then it is power of 2
		
		int bitMask = 1 << 0; //which is 0001 OR 1 in decimal; so set it as normal 1
		bitMask = 1;
		
		int count = 0;
		
		while(number > 0) {
			int isBitOne = bitMask & number;
			if(isBitOne != 0) ++count;
			number = number>>1;
		}
		
		if(count == 1)	System.out.println("Number is power of 2");
		else System.out.println("Number isn't power of 2");
	}
}