package javacollections.stack;

import java.util.Stack;

public class StackClass {
	//Method to add an element at bottom of stack
	//Time: O(N), Space: O(N) Recursive calls uses implicit stack to save data
	public static void pushAtBottom(Stack<Integer> st, int data) {
		if(st.isEmpty()) {
			st.push(data);
			return;
		}
		
		int top = st.pop();
		pushAtBottom(st, data);
		
		st.push(top);		
	}
	
	//Method to reverse stack
	//Time: O(N^2), Space: O(N) Recursive calls uses implicit stack to save data
	public static void reverse(Stack<Integer> st) {
		if(st.isEmpty())
			return;
		
		int top = st.pop();
		reverse(st);
		//this recursive call is just to reach till stack is empty without 
		//need to count number of elements and then once it's empty, 
		//start pushing popped element at bottom in each recursive call

		pushAtBottom(st, top);
		
		//This also works however interviewer expects us to know above
//		for(int i=0; i<st.size(); ++i) {
//			int top = st.pop();
//			pushAtBottom(st, top);
//		}
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(5);
		st.push(17);
		st.push(12);
		pushAtBottom(st, 45);
		
		while(!st.isEmpty()) {
            System.out.println(st.pop());
        }
		System.out.println();
		st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		reverse(st);

		while(!st.isEmpty()) {
            System.out.println(st.pop());
        }
	}
}