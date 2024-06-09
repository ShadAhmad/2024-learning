package javacollections.stack;
//Stack implementation using ArrayList
import java.util.ArrayList;

public class StackClassAL {
	//static class can be directly accessed in main method()
	static class Stack {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		public void push(int data) {
			list.add(0, data);
		}
		
		public int pop() {
			if(list.size() == 0)
				return -1;
			
			return list.remove(list.size()-1);
		}
		
		public int peek() {
			if(list.size() == 0)
				return -1;
			
			return list.get(list.size()-1);
		}
	}
	
	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println(st.peek());
		st.push(5);
		st.push(17);
		st.push(12);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
	}
}