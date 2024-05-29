package javacollections.linkedlist;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(5);
		ll.add(8);
		ll.add(6);
		ll.add(1);
		ll.addFirst(12);
		ll.addLast(3);

		ll.remove(1);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll.get(0));
		System.out.println(ll.size());
		System.out.println(ll);
	}
}