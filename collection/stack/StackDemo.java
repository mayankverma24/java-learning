package stack;

import java.util.Collection;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object> st = new Stack<Object>();
		st.add("Mayank");
		st.add(1);
		st.add(3.0f);
		st.add("India");
		//st.addAll(1,Collection<Object>());
		System.out.println(st.peek());
		System.out.println(st.search("India"));
		System.out.println(st);
	}

}
