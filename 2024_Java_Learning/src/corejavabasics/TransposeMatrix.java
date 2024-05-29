package corejavabasics;
import java.util.Scanner;

public class TransposeMatrix {

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
		sc.close();
		
		System.out.println("\nMatrix");
		for(int i=0; i<r; ++i) {
			for(int j=0; j<c; ++j)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		
		int transpose[][] = new int[c][r];
		int x=0, y=0;
		
		for(int i=0; i<c; ++i) {
			for(int j=0; j<r; ++j) {
				transpose[i][j] = matrix[x++][y];
				
				if(x==r) { x=0; ++y; }
			}
		}
		
		System.out.println("\nTranspose Matrix");
		for(int i=0; i<c; ++i) {
			for(int j=0; j<r; ++j)
				System.out.print(transpose[i][j] + " ");
			System.out.println();
		}
	}
}