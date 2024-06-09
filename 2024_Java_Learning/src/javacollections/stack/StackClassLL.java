package javacollections.stack;
//Stack implementation using LinkedList
public class StackClassLL {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}		
		
	public boolean isEmpty() {
		return head == null;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;			
		head = newNode;
	}
	
	public int pop() {
		if(isEmpty())
			return -1;
		
		int top = head.data;
		head = head.next;
		return top;
	}
	
	public int peek() {
		if(isEmpty())
			return -1;
		
		return head.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackClassLL st = new StackClassLL();
		System.out.println(st.peek());
		st.push(5);
		System.out.println(st.peek());
		st.push(2);
		st.push(8);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		st = new StackClassLL();
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		
		while(!st.isEmpty())
			System.out.println(st.pop());
	}
}
