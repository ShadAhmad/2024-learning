package corejavabasics;
import java.util.Scanner;

public class SpriralPrintMatrix {

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
		
		System.out.print("\nSpiral Print: ");
		
		int rowBeg = 0, colBeg = 0, rowEnd = r-1, colEnd = c-1;
		
		while(rowBeg <= rowEnd && colBeg <= colEnd) {
			for(int i=colBeg; i<=colEnd; ++i)
				System.out.print(matrix[rowBeg][i] + " ");
			++rowBeg;
			
			for(int i=rowBeg; i<=rowEnd; ++i)
				System.out.print(matrix[i][colEnd] + " ");
			--colEnd;
			
			for(int i=colEnd; i>=colBeg; --i)
				System.out.print(matrix[rowEnd][i] + " ");
			--rowEnd;
			
			for(int i=rowEnd; i>=rowBeg; --i)
				System.out.print(matrix[i][colBeg] + " ");
			++colBeg;
		}
	}
}