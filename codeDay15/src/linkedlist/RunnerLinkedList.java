package linkedlist;

public class RunnerLinkedList {

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