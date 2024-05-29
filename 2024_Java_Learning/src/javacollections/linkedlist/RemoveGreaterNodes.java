package javacollections.linkedlist;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class RemoveGreaterNodes {
	Node head;
	int size;
	
	RemoveGreaterNodes() {
		size =  0;
	}
	
	void addNode(int data) {
		Node newNode = new Node(data);
				
		if(head == null)
			head = newNode;
		else {
			Node currNode = head;
			
			while(currNode.next != null)
				currNode = currNode.next;
			
			currNode.next = newNode;
		}
	}
	
	void displayList() {
		if(head == null)	return;
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
	
	void removeGreaterNodes(int x) {
		
		while(head != null && head.data > x) {
			head = head.next;
		}

		if(head != null) {
			Node currNode = head;
			Node nextNode = head.next;
			
			while(nextNode != null) {
				if(nextNode.data > x)
					currNode.next = nextNode.next;
				else
					currNode = currNode.next;
				
				nextNode = currNode.next;
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RemoveGreaterNodes rgn = new RemoveGreaterNodes();
		
		int num = 0;
		
		do {
			System.out.print("Enter a number b/w 1 and 50: ");
			num = sc.nextInt();
			
			if(num < 1 || num > 50) break;
			rgn.addNode(num); 
		}while(true);
		
		sc.close();
		
		rgn.displayList();
		
		System.out.print("\nAfter Removing Nodes greater than 25: ");
		rgn.removeGreaterNodes(25);
		rgn.displayList();
	}
}