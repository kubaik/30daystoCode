package linkedlist;

public class DoublyLinkedList {

	int count;
	DoublyNode head;
	
	public DoublyLinkedList () {
		head=null;
		count=0;
	}
	
	public DoublyLinkedList(DoublyNode node ) {
		head=node;
		count=1;
	}
	
	public void add(int data) {
		DoublyNode temp=new DoublyNode(data);
		
		DoublyNode current=head;
		if(current==null) {
			current=temp;
		}
		else {
		while(current.getNext()!=null) {
			current=current.getNext();
		}
		current.setNext(temp);
		}
		temp.prev=current;
		temp.next=null;
		System.out.println("Dobly linked list node added"+temp.getData());
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void printNodes() {
		DoublyNode current=head;
		if(current==null) {
			System.out.println("List has no nodes");
		}
		else {
		
		while(current.getNext()!=null) {
			current=current.getNext();
			System.out.println(current.getData());
		}}
		//System.out.println(current.getData());
	}
	
	public void remove() {
		DoublyNode current=head;
		System.out.println("hello mai bhaii remove mai hu baalaa bala");
		if(current.getNext()!=null) {
		while(current.getNext().getNext()!=null) {
			current=current.getNext();
		}
		//current.getNext().setPrev(null);
		//System.out.println("Node deleted ="+ current.getData());
		current.setNext(null);
		}
		else 
			head=null;
		
		count--;
	} 
	
	 
}
