package javacollections.linkedlist;

public class ReverseLinkedList extends LinkedListScratch {

	/*public void reverseList() {
		if(head == null || head.next == null) {
           return;
       }

		Node prevNode = head;
		Node currNode = head.next;		
		
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			prevNode = currNode;
			currNode = nextNode;
		}
		
		head.next = null; //To break existing connection of original head with 2nd Node		
		head = prevNode;
	}*/
	
	//No extra memory usage except constant i.e. O(1) space
	//Time: O(N)		
	public void reverseLinkedList() {
		if(head == null || head.next == null) {
           return;
		}

		Node prevNode = null;
		Node currNode = head;		
		
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			prevNode = currNode;
			currNode = nextNode;
		}
		
		head = prevNode;
	}
	
	public Node reverseRecursiveLinkedList(Node head) {
		if(head == null || head.next == null) {
           return head;
		}
		
		//newHead will always be same i.e. original list tail
		//but we call this recursively to reverse each sub-linked list
		Node newHead = reverseRecursiveLinkedList(head.next);

		head.next.next = head;
		head.next = null;
		
		return newHead;
	}
	
	public static void main(String[] args) {
		
		ReverseLinkedList rll = new ReverseLinkedList();

		rll.addFirst("55");
		rll.addLast("ooo");
		rll.addFirst("hggh");
		rll.addLast("b");
		rll.addFirst("89");
		rll.addLast("222");
		
		rll.printList();
		
		rll.reverseLinkedList();
		rll.printList();
		
		rll.head = rll.reverseRecursiveLinkedList(rll.head);
		rll.printList();
	}
}