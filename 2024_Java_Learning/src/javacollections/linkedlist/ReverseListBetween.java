package javacollections.linkedlist;

public class ReverseListBetween extends LinkedListScratch {
	
	//Reverse b/w startPos and endPos, both inclusive
	//Time: O(N), Space: O(1)
	public void reverseLinkedListBetween(int startPos, int endPos) {
		
		if(head == null || head.next == null || startPos == endPos)
			return;

		//Necessary to handle case where start position is 1
		//Create a dummy node whose next points to head
		Node tempNode = new Node("-1");
		tempNode.next = head;
		
		Node prevToStartPosNode = tempNode;
		Node startPosNode = head;
		
		//Find the Node from where reversal has to be done
		for(int i=1; i<startPos; ++i) {
			prevToStartPosNode = startPosNode;
			startPosNode = startPosNode.next;
		}
		
		// 'startPosNode' is the node from which reversal has to be started
		// Keep this Node & 'prevToStartPosNode' unaffected, so that it can be later used to link to Node after the end position
		Node startingPositionNode = startPosNode;
		
		/*
		 * Reversing the LinkedList starting from startPosNode now
		 */
		//Currently, assume we'll reverse list without connecting to Nodes before the startPos &
		//we'll start with current node as starting position node i.e. startPosNode
		Node prev = null;
		Node curr = startPosNode;
		
		//Now reverse list number of times as number of elements (endPos-startPos+1)
		//Eg. startPos=3, endPos=6;   No of elements to change: 3,4,5,6 = 4
		//bcoz the first node itself also has to be updated with
		//next as null and then further nodes
		for(int i=1; i<=endPos-startPos+1; ++i) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;			
			curr = next;
		}
		
		//After reversal, the prev Node has the new head node
		//Now, we'll point this new head node (prev) to next of Node which was previous to startPosNode
		prevToStartPosNode.next = prev;
		
		//After reversal, the next of original head points to null
		//hence, next of actual startPosNode has been set to null using curr above
		//So, now we've to link it to Node after the Node of ending position, which is now curr
		startingPositionNode.next = curr;
		
		//needed bcoz in above two statements head will be lost if startPos=1
		head = tempNode.next; 
	}

	public static void main(String[] args) {
		ReverseListBetween rb = new ReverseListBetween();

		rb.addLast("1");
		rb.addLast("2");
		rb.addLast("3");
		rb.addLast("4");
		rb.addLast("5");
		rb.addLast("6");		
		rb.printList();
		
		rb.reverseLinkedListBetween(2,4);
		rb.printList();
		rb.reverseLinkedListBetween(1,1);
		rb.printList();
		rb.reverseLinkedListBetween(1,2);
		rb.printList();
		rb.reverseLinkedListBetween(1,3);
		rb.printList();
		
		rb = new ReverseListBetween();
		rb.addLast("5");
		rb.printList();
		
		rb.reverseLinkedListBetween(1,1);
		rb.printList();
		
		rb = new ReverseListBetween();
		rb.addLast("5");
		rb.addLast("2");
		rb.printList();
		
		rb.reverseLinkedListBetween(1,2);
		rb.printList();
	}
}