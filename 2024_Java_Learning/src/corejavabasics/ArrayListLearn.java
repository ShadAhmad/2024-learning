package corejavabasics;
import java.util.ArrayList;

public class ArrayListLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(0, 45);
		al.add(55);
		al.set(1, 7);
		al.remove(2);
		
		System.out.println(al.size());
		System.out.println(al);
		
		ArrayList<Integer> alNew = new ArrayList<>();
		alNew.addAll(al);
		alNew.addAll(al);
		alNew.addAll(3, al);
		
		al.clear();
		System.out.println(al);
		System.out.println(alNew);
	}
}