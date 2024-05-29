package corejavabasics;

public class AdvancePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		for(int i=1; i<=n; ++i) {
			for(int j=1; j<=i; ++j) {
				if(j==1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=1; j<=n-i; ++j)
				System.out.print("  ");
			for(int j=1; j<=i; ++j) {
				if(j==1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=n; i>=1; --i) {
			for(int j=1; j<=i; ++j) {
				if(j==1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=1; j<=n-i; ++j)
				System.out.print("  ");
			for(int j=1; j<=i; ++j) {
				if(j==1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=n; ++i) {
			for(int j=1; j<=n-i; ++j)
                System.out.print(" ");
			
			System.out.print("*");
			
			for(int j=2; j<n; ++j) {
				if(i==1 || i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println("*");
			System.out.println();
		}
		
		System.out.println();
		
	    for(int i=1; i<=n; ++i) {
	        for(int j=1; j<=n-i; ++j)
                System.out.print(" ");
	        for(int j=1; j<=i; ++j)
	            System.out.print(j + " ");
            System.out.println();
	    }
	    
	    System.out.println();

 		n = 4;
	    
	    for(int i=1; i<=n; ++i) {
	        for(int j=1; j<=6-i; ++j)
                System.out.print(i);
            System.out.println();
	    }
	}
}
