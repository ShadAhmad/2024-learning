package corejavabasics;
abstract class Animal {
	String name;
	
	public Animal() {
		System.out.println("Animal constructor invoked");
		this.name = this.getClass().getName();
	}
	
	public abstract void action();
	
	public void displayInfo() {
		System.out.println("Class Name is " + this.name);
		this.action();
	}
}

class Dog extends Animal {
	public Dog() {
		System.out.println("Dog constructor invoked");
	}
	public void action() {
		System.out.println("Dogs Bark");
	}
}

class Lion extends Animal {
	public void action() {
		System.out.println("Lion Roar");
	}
}

public class LearnAbstraction {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.displayInfo();
		System.out.println();
		Lion l = new Lion();
		l.displayInfo();
	}
}