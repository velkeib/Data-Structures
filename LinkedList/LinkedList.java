package LinkedList;

public class LinkedList{
	Node head;
	
	public LinkedList(){
		head = null;
	}
	
	public boolean isEmpty(){
		return this.head == null ? true : false;
	}
	
	public void add(int data){
		Node newNode = new Node(data);
		
		if(this.isEmpty()){
			this.head = newNode;
		}else{
			
			Node next = this.head;
			
			while(next.getNext() != null){
				next = next.getNext();
			}
			
			next.setNext(newNode);
		}
	}
	
	public void printList(){
		
		if(this.isEmpty()){
			System.out.println("Empty list");
		}else{
			
			Node next = this.head;
			
			while(next.getNext() != null){
				next = next.getNext();
				System.out.println("" + next.getData());
			}
			
			
		}
	}
	
}