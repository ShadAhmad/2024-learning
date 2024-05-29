package corejavabasics;
import java.util.Scanner;

public class SearchMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();
		
		int matrix[][] = new int[r][c];
		
		System.out.print("Enter " + r*c + " numbers: ");
		for(int i=0; i<r; ++i) {
			for(int j=0; j<c; ++j)
				matrix[i][j] = sc.nextInt();
		}
			
		System.out.print("Enter the number to search: ");
		int search = sc.nextInt();
		sc.close();
		
		for(int i=0; i<r; ++i) {
			for(int j=0; j<c; ++j) {
				if(matrix[i][j] == search) {
					System.out.println("Found at: " + (i+1) + ", " + (j+1));
					return;
				}
			}
		}		
	}
}