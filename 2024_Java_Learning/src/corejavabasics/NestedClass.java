package corejavabasics;

public class NestedClass {
	int size;
	
	static class A {
		void setSize(int data) {
			//size = data;  
			//error here as static class can't
			//access non-static data/methods of outer class
		}
	}	
	class B { 
		void setSize(int data) {
			size = data;
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		
		NestedClass nc = new NestedClass();
		B b1 = nc.new B();
		
		//B b2 = new B();    
		//error here; non-static nested class not 
		//accessible vidout outer class object
	}
}