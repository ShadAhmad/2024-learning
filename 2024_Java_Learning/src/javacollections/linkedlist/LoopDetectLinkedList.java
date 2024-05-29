package javacollections.linkedlist;

public class LoopDetectLinkedList extends LinkedListScratch {
	
	//Time O(N), Space O(1)
	public boolean hasLoop() {
		 if(head == null) return false;
		if(head.next == head) return true;
		
		//Floyd's Turtle (fast) & Hare (slow) Algo
		//Turtle goes 1 step a time whereas Hare goes 2 steps at a time
		//If there exists a loop, at some point the Turtle will meet Hare
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			//Comparison done after moving once bcoz initially both point to head Node
			if(slow == fast)
				return true;
		}
		
		return false;
	}
	
	//Take two Nodes, the head Node and the Node where fast & slow meet
	//Now start going next for each of them & Node where they're same, it's cycle Node
	public Node getCycleNode() {
		
		if(head == null || head.next == null) return null;
		
		Node slow = head;
		Node fast = head;
		
		//For conditions where only one or two non-cycle nodes are present,
		//slow and fast keep pointed to head and gives slow == head and wrong result
        boolean hasCycle = false;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				hasCycle = true;
                break;
            }
		}
		
		if(!hasCycle) return null;
		
		Node headNode = head;
		Node meetingNode = slow;
		
		while(headNode != meetingNode) {
			headNode = headNode.next;
			meetingNode = meetingNode.next;
		}
		
		return meetingNode;
	}
	
	//To remove the loop/cycle
	//Find node which causes cycle & set its next as null
	public void removeLoop() {
		getCycleNode().next = null;
	}

	public static void main(String[] args) {

		LoopDetectLinkedList ldll = new LoopDetectLinkedList();

		ldll.addLast("1");
		ldll.addLast("2");
		ldll.addLast("3");
		ldll.addLast("4");
		ldll.addLast("5");
		ldll.addLast("6");		
		ldll.printList();
		
	}
}