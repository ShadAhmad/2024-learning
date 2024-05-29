package corejavabasics;
import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();
		sc.close();
		
		int n1 = 0, n2 = 1;
		
		if(n >= 1) {
			System.out.print(n1+", ");
						
			int term = n2;
		
			for(int i=2; i<=n; ++i) {
				System.out.print(term + ", ");
				term = n1+n2;
				n1 = n2;
				n2 = term;
			}
		}
	}
}