package corejavabasics;

public class AdvancePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
		for(int i=1; i<=n; ++i) {
			for(int j=1; j<=i; ++j)
				System.out.print("*");
			for(int j=i+1; j<=n; ++j)
				System.out.print("  ");
			for(int j=1; j<=i; ++j)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=n-1; i>0; --i) {
			for(int j=1; j<=i; ++j)
				System.out.print("*");
			for(int j=i+1; j<=n; ++j)
				System.out.print("  ");
			for(int j=1; j<=i; ++j)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		n = 5;
		
		for(int i=1; i<=n; ++i) {
			for(int j=1; j<=n-i; ++j)
				System.out.print(" ");
			for(int j=1; j<=n; ++j)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=n; ++i) {
			for(int j=1; j<=n-i; ++j)
				System.out.print(" ");
			for(int j=1; j<=i; ++j)
				System.out.print(i + " ");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=n; ++i) {
			for(int j=1; j<=n-i; ++j)
				System.out.print("  ");
			for(int j=i; j>1; --j)
				System.out.print(j + " ");
			for(int j=1; j<=i; ++j)
				System.out.print(j + " ");
			System.out.println();
		}
		
		System.out.println();
		
		n = 4;
		
		for(int i=1; i<=n; ++i) {
			for(int j=1; j<=n-i; ++j)
				System.out.print(" ");
			for(int j=1; j<=(i*2)-1; ++j)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=n; i>=1; --i) {
			for(int j=1; j<=n-i; ++j)
				System.out.print(" ");
			for(int j=1; j<=(i*2)-1; ++j)
				System.out.print("*");
			System.out.println();
		}
	}

}
