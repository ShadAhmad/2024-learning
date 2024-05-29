package corejavabasics;

public class ScopeLearn {
	int a, b;
	
	public ScopeLearn() {
		int a = 5;
		int b = 2;
		
		System.out.println(a + " " + b);
	}
	
	public void display() {
		System.out.println("A: " + a + "\tB: " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopeLearn sl = new ScopeLearn();
		sl.display();
	}
}