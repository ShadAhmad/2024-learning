package javacollections.linkedlist;

public class PalindromeLinkedList extends LinkedListScratch {
	
	public Node reverseLinkedList(Node headNode) {
		if(headNode == null || headNode.next == null) {
           return headNode;
		}

		Node prevNode = null;
		Node currNode = headNode;		
		
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			prevNode = currNode;
			currNode = nextNode;
		}
		
		headNode = prevNode;
		return headNode;
	}
	
	public Node getMidNode() {
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	//Time: O(N); Space: O(1)
	public boolean isPalindrome() {
		if(head == null || head.next == null) return true;
		
		Node midNode = getMidNode();
		
		//If odd number of nodes, the midNode will be the middle one 
		//and we'll take it in 1st half; if even nodes [1,2,3,4], midNode will return 2 
		Node midReversedList = reverseLinkedList(midNode.next);
		
		Node originalList = head;
		
		while(midReversedList != null) {
			
			if(originalList.data != midReversedList.data)
				return false;
			
			midReversedList = midReversedList.next;
			originalList = originalList.next;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		PalindromeLinkedList pll = new PalindromeLinkedList();

		pll.addLast("1");
		pll.addLast("2");
		pll.addLast("3");
		pll.addLast("4");
		pll.addLast("5");
		pll.addLast("6");
		pll.addLast("7");
		pll.addLast("8");
		pll.addLast("9");
		
		pll.printList();
		
		System.out.println(pll.isPalindrome());
		
		pll = new PalindromeLinkedList();
		pll.addLast("1");
		pll.addLast("2");
		pll.addLast("3");
		pll.addLast("4");
		pll.addLast("6");
		pll.addLast("5");
		pll.addLast("4");
		pll.addLast("3");
		pll.addLast("2");
		pll.addLast("1");
		
		pll.printList();
		
		System.out.println(pll.isPalindrome());		
	}
}