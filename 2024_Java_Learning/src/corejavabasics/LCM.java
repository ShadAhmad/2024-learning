package corejavabasics;
import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int n2 = sc.nextInt();
		sc.close();
		
		int large, small;
		if(n1>n2) { large = n1; small = n2; }
		else { large = n2; small = n1; }
		//large = Math.max(n1, n2);
		
		int multiple = large;
		
		while(multiple%small != 0) 
			multiple += large;
		
		System.out.println(multiple);
	}
}