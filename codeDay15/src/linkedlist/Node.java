package linkedlist;

public class Node {

	Node next;
	int data;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
	public Node(int data,Node next) {
		this.data=data;
		this.next=next;
	}
	
	//Setters & Getters
	
	public Node getNext() {
		return next;
	}
	public int getData() {
		return data;
	}
	
	public void setNext(Node next) {
	
		this.next=next;
	}
	public void setData(int data) {
		this.data=data;
	}
	
	public String toString() {

		return "["+ this.getData()+"->"+this.getNext()+"]";
		
	}
	}
