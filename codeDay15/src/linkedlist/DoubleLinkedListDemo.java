package linkedlist;

public class DoubleLinkedListDemo { 

	DoublyNode head;
	int count;
	
	public DoubleLinkedListDemo() {
		head=null;
		count=0;
	}
	public DoubleLinkedListDemo(DoublyNode node) {
		this.head=node;
		count=1;
	}
	
	public DoubleLinkedListDemo(DoublyNode node, DoublyNode next,DoublyNode prev) {
		this.head=node;
		next=null;
		prev=null;
	}
	
	public void add(int data) {
		DoublyNode temp=new DoublyNode(data);
		DoublyNode current=head;
		if(head==null) {
		//DoubleLinkedListDemo LL=new DoubleLinkedListDemo(temp);
			head=temp;
		}
		else {
			while(current.getNext()!=null) {
				current=current.getNext();
			}
			current.setNext(temp);
		}
		count++;
	}
	
	public int getSize() {
		return count;
	}
	public int Remove(int index) {
		DoublyNode current=head;
		int i=1;
		int data;
		if(getSize()==0) {
			System.out.println("bhai yaha bhi bhikhari hai");
			return 0;
		}
		
		
		if(index==1) {
			data=current.getData();
			head=null;
		}
		else {
			data=current.getData();
		while(current.getNext()!=null) {
			i++;
			if(i==index) {
				if(current.getPrev()==null) {
					
					head=current.getNext();
				}
				else if(current.getNext()==null) {
					
					current.getPrev().setNext(null);
				}
				else {
					current.prev.next=current.next;
				current.next.prev=current.prev;
				}
			}
			
			current=current.getNext();
		}
	}
		return data;
		}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public int search(int element) {
		DoublyNode current=head;
		if(isEmpty()==true)
			return 0;
		while(current.getNext()!=null) {
			if(element==current.getData())
				break;
			current=current.getNext();
		}
		return current.getData();
	}
	
	public void clear() {
		head=null;
	}
}
