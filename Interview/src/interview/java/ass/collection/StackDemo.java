package interview.java.ass.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack<>();
		s.push("A");
		s.push("B");
		s.push("c");
		System.out.println("push stack is :"+s);
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		s.pop();
		System.out.println("pop stack is :"+s);
		s.peek();
		System.out.println("peek stack is :"+s);
        s.isEmpty();
		System.out.println("empty stack is :"+s);  
		s.search("A");
		System.out.println("search stack is :"+s);

	}
}
