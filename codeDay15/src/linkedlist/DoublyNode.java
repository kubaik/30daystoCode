package linkedlist;

public class DoublyNode {

	DoublyNode prev;
	DoublyNode next;
	int data;
	
	public DoublyNode(int data) {
		this.data=data;
		this.prev=null;
		this.next=null;
	}
	
	public DoublyNode(int data, DoublyNode prev, DoublyNode next) {
		this.data=data;
		this.prev=prev;
		this.next=next;
	}
	
	// Getters and Setters
	
	public DoublyNode getPrev() {
		return prev;
	}
	
	public DoublyNode getNext() {
		return next;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data=data;
	}
	
	public void setPrev(DoublyNode prev) {
		this.prev=prev;
	}
	
	public void setNext(DoublyNode next) {
		this.next=next;
	}
}

