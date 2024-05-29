package corejavabasics;
import java.util.Scanner;
public class GCD {

	private static int getHCF(int n1, int n2) {
		while(n1 != n2) {
			if(n1>n2)
				n1 = n1 - n2;
			else
				n2 = n2 - n1;
		}
		return n2;
	}
	
	private static int getHCF1(int a, int b) {
		int t;
		
		while(b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		
		return a;
	}
	
	private static int getHCF2(int x, int y) {
		if(x == 0) return y;
		if(y == 0) return x;
		
		int t;		
		while(x%y != 0) {
			t = y;	y = x%y;	x = t;
		}		
		return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int n2 = sc.nextInt();
		sc.close();
		System.out.println(getHCF(n1, n2));
		System.out.println(getHCF1(n1, n2));
		//System.out.println(getHCF2(461952, 116298));
		System.out.println(getHCF2(0, 461952));
		System.out.println(getHCF1(0, 461952));
		System.out.println(getHCF2(0, -5));
	}
}