package javacollections.hash;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
	
	//Size of Union of two arrays
	public static int union(int arr1[], int arr2[]) {
		HashSet<Integer> unique = new HashSet<>();

		for(int i : arr1)
			unique.add(i);
		for(int i : arr2)
			unique.add(i);
		
		return unique.size();
	}
	
	//Size of Intersection of two arrays
	public static int intersection(int arr1[], int arr2[]) {
		HashSet<Integer> unique = new HashSet<>();
		int intersectionSize = 0;
		for(int i : arr1)
			unique.add(i);
		for(int i : arr2) {
			if(unique.contains(i)) {
				//To avoid matching in case an element is present twice in array
				//Without this output is 3 since 9 is present twice in 2nd array
				unique.remove(i);
				++intersectionSize;
			}
		}
		
		return intersectionSize;
	}

	public static void main(String[] args) {
	
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(5);
		hs.add(7);
		hs.add(2);
		hs.add(11);
		System.out.println(hs);
		hs.remove(7);
		System.out.println(hs.contains(2));
		System.out.println(hs);
		System.out.println();
		
		//Traversing using iterator
		Iterator itr = hs.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		
		//Traversing using for-each loop
		for(Integer i : hs)
			System.out.print(i + " ");
		System.out.println("\n");

		int arrA[] = {7, 3, 9};
		int arrB[] = {6, 3, 9, 2, 9, 4};
		System.out.println(union(arrA, arrB));
		System.out.println(intersection(arrA, arrB));
	}
}