package datastructure;

import java.util.LinkedList;
import java.util.Stack;

public class Queue {

	LinkedList queue;
	
	//Making a queue instance
	public Queue() {
		queue=new LinkedList();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	// what is the size of our queue?
	public int size() {
		return queue.size();
	}
	//Enqueue the item
	public void enqueue(String n) {
		queue.addLast(n);
	}
	// Dequeuing an item
	public String dequeue() {
		return (String) queue.remove(0);
	}
	// peek at the first item
	public String peek() {
		return (String) queue.get(0);
	}
	
	public static void main(String[] args) {
		
		Stack<String> st=new Stack<>();
		st.push("pooja");
		st.push("manish");
		st.push("muku");
		
		System.out.println("pop out 1st element"+st.pop());
		System.out.println("peek out element"+st.peek());
		System.out.println("pop out 2nd element"+st.pop());
		System.out.println("size"+st.size());
		
		Queue q=new Queue();
		/*
		 * q.enqueue(5); q.enqueue(10); q.enqueue(15);
		 */
		q.enqueue("hi");
		q.enqueue("hello");
		q.enqueue("bye");
		System.out.println("first out :"+q.dequeue());
		System.out.println("Peek at second item out :"+q.peek());
		System.out.println("second out :"+q.dequeue());
		System.out.println("third out :"+q.dequeue());
	}
}
