package javacollections.linkedlist;

public class DeleteNodeXFromEnd extends LinkedListScratch{
	
	public void deleteXFromEnd(int posFromEnd) {
		if(head == null) return;
		if(posFromEnd <= 0) { System.out.println("Invalid Position"); return; }
		
		int listSize = this.size();
		
		if(posFromEnd > listSize) { System.out.println("Invalid Position"); return; }
		
		if(listSize == 1) {
			head = null;
			return;
		}
		
		if(posFromEnd == listSize) {
			head = head.next;
			return;
		}
		
		int posFromBeg = listSize - posFromEnd + 1;
		int prevNodePos = posFromBeg - 1;
		
		Node currNode = head;
		
		for(int i=1; i<prevNodePos; ++i) {
			currNode = currNode.next;
		}
		
		currNode.next = currNode.next.next;
	}

	public static void main(String[] args) {

		
		DeleteNodeXFromEnd dfe = new DeleteNodeXFromEnd();
		
		dfe.addFirst("55");
		dfe.addLast("ooo");
		dfe.addFirst("hggh");
		dfe.addLast("b");
		dfe.addFirst("89");
		dfe.addLast("222");

		dfe.printList();
		
		dfe.deleteXFromEnd(6);
		dfe.printList();		
	}
}