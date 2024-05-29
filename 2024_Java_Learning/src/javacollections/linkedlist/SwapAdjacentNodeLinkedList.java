package javacollections.linkedlist;

public class SwapAdjacentNodeLinkedList extends LinkedListScratch {

	//Time: O(N), Space: O(1)
	//IMPORTANT: In cases where head of original is possible to change, create a temp node
	//whose next points to head (or respective Node) of the original list; return it at end by temp.next
    public Node swapPairs(Node head) {
        if(head == null || head.next == null) return head;
        
        //As per logic, original head.next is the final head which we'll have to return
        Node temp = new Node("0");
        temp.next = head.next;
        
        //Pair of Node A, Node B which after swapping
        //Node A ka next will point to 1st Node of next pair
        //Node B ka next will point to Node A of current pair
        //However, the previous pair's 2nd Node is still pointing
        //to Node A which is losing Node B in chain, as it's Node B
        //whose next is point to our Node A; 
        //so update previous pairs 2nd Node ka next as Node B of current pair
        Node prev = new Node("0");
        
        Node node1 = head;
        Node node2 = head.next;
        
        do {
            Node node3 = node2.next;
            node2.next = node1;
            node1.next = node3;
            
            //As mentioned earlier, updating previous pair's 2nd Node as Node 2 of current pair
            prev.next = node2;
            
            if(node3 == null || node3.next == null) break;
            
            //Updating 2nd Node of the latest previous pair in prev
            prev = node1;
            
            node1 = node1.next;
            node2 = node1.next;
        }while(true);
        
        return temp.next;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
