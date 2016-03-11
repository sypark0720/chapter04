package chapter04;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		
		stack.push("Amy");
		stack.push("Bob");
		stack.push("Cindy");
		
		String s = stack.pop();
		
		System.out.println(s);
		System.out.println(stack.size());
		
		s = stack.peek();//실제로 pop은 안일어나고 슬쩍 훔쳐만 본다.
		System.out.println(s);
		System.out.println(stack.size());
		
		stack.pop();
		stack.pop();
		System.out.println(stack.size());
		
		if(stack.isEmpty() == false){
			stack.pop();
		}
		
	}

}
