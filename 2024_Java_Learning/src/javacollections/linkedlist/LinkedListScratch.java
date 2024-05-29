package javacollections.linkedlist;

public class LinkedListScratch {
	
	Node head;
	private int size;
	
	LinkedListScratch() {
		size = 0;
	}
	
	/* For better streamlining, since Node is to be used with LinkedList
	 * only, we write the Node class inside the LinkedList class
	 * Since, we don't need any non-static methods/members of LinkedList class
	 * to be accessed in Node class, we can declare Node class as static as well
	 * Note: If separate Node class, size variable in-accessible; manually change size in each method 
	 */
	class Node {
		String data;
		Node next;
		
		Node(String data) {
			this.data = data;
			this.next = null;
			++size;
		}
	}
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	void addLast(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node lastNode = head;
		
		while(lastNode.next != null)
			lastNode = lastNode.next;
		
		lastNode.next = newNode;
	}
	
	void printList() {
		Node currNode = head;
		
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}
	
	void removeFirst() {
		if(head == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		
		head = head.next;
		--size;
	}
	
	void removeLast() {
		if(head == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		
		if(head.next == null) {
			head = null;
			--size;
			return;
		}
		
		Node currNode = head;
		Node lastNode = currNode.next; //Note: the data of lastNode won't be updated based on currNode

		while(lastNode.next != null) {
			currNode = currNode.next;
			lastNode = lastNode.next;
		}
	
		currNode.next = null;
		
		--size;
	}
	
	int size() {
		return this.size;
	}
	
	void addInMiddle(int index, String data) {
		
		if(index < 0 || index > size) {
			System.out.println("Invalid Index");
			return;
		}
		
		Node newNode = new Node(data);
		
		if(head == null)
			return;		
		
		if(index == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node currNode = head;
	
		for(int i=0; i<index-1; ++i) {
			currNode = currNode.next;
		}
		
		newNode.next = currNode.next;
		currNode.next = newNode;
	}
	
	public static void main(String[] args) {
		
		LinkedListScratch ll = new LinkedListScratch();

		ll.addFirst("55");
		ll.addLast("ooo");
		ll.addFirst("hggh");
		ll.addLast("b");
		ll.addFirst("89");
		ll.addLast("222");

		ll.printList();
		
		ll.removeFirst();
		ll.printList();
		
		ll.removeLast();
		ll.printList();
		
		System.out.println(ll.size());

		ll.addInMiddle(10, "QWERTY");
		ll.printList();
		
		ll.addInMiddle(2, "QWERTY");
		ll.printList();
		
		ll.addInMiddle(0, "QWERTY");
		ll.printList();
		
		ll.addInMiddle(6, "QWERTY");
		ll.printList();
		
		ll.addInMiddle(7, "QWERTY");
		ll.printList();
	}
}