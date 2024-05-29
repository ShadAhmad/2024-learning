package corejavabasics.learningpackage;

interface Animal {
   int eyes = 2;
   void walk();
}
class Dog implements Animal {
	int eyes = 5;
   public void walk() {
       System.out.println("Dog walks on 4 legs and has " + eyes + " eyes.");
   }
}
public class LearnInterface {
   public static void main(String args[]) {
      Dog dog = new Dog ();
      dog.walk();
   }
}