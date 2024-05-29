package corejavabasics;
import java.util.Scanner;

public class StringArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String sArr[] = new String[n];
		
		int totLen = 0;
		
		for(int i=0; i<sArr.length; ++i) {
			System.out.print("Enter String #" + (i+1) + ": ");
			sArr[i] = sc.nextLine();
			totLen += sArr[i].length();
		}
		sc.close();
		
		System.out.println("Total Length is " + totLen);
	}
}