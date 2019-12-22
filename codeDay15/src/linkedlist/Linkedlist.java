package linkedlist;

import java.util.LinkedList;

public class Linkedlist {

	Node head;
	int count;
	public Linkedlist (){
		head=null;
		count=0;
	}
	public Linkedlist(Node head)
	{
		this.head=head;
		count=1;
	}
	public void insert(int data) {
		Node temp=new Node(data);
		Node current=head;
		while(current.getNext()!=null) {
			current=current.next;
			//System.out.println("Current node is"+temp.getData());
		}
		
		//current.setData(data);
		current.setNext(temp);
		System.out.println("Current node is"+temp.getData());
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void remove() {
		Node current=head;
		if(current.getNext()!=null) {
		while(current.getNext().getNext()!=null) {
			current=current.next;
		}
		current.setNext(null);
		}
		else
			head=null;
		System.out.println("chalo mai to jail se chhotaa");
		count--;
		
	}
	public static void main(String[] args) {
		
		Node node=new Node(10);
		  Linkedlist list=new Linkedlist(node); 
		  list.insert(20); 
		  list.insert(30); list.insert(40);
		  
		  list.remove();
		/*
		 * list.insert(20); list.insert(30); list.insert(40); list.toString();
		 * 
		 * LinkedList<String> l=new LinkedList<String>(); l.add("pooja");
		 */
		node.toString();

		DoublyNode dnode=new DoublyNode(100);
		DoublyLinkedList ls=new DoublyLinkedList(dnode);
		//ls.add(200);
		
		ls.remove();
		ls.add(400);
		ls.printNodes();
		
	}

}
