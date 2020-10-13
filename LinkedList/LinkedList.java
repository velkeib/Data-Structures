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
	
	public void add(int index, int data){
		
		Node newNode = new Node(data);
		
		if(index == 0){
			newNode.setNext(this.head);
			this.head = newNode;
		}else if(index == 1){
			newNode.setNext(this.head.getNext());
			this.head.setNext(newNode);
		}else{
			Node node = this.head;
			
			int i = 0;
			
			while(i < index - 1){
				node = node.getNext();
				
				newNode.setNext(node.getNext());
				node.setNext(newNode);
				i++;
			}
		}
	}
	
	public int get(int index){
		
		int i = 0;
		
		Node node = this.head;
		
		if(index == 0){
			return this.head.getData();
		}
		else{
			while(i < index){
				node = node.getNext();
				i++;
			}
		}
		
		return node.getData();
	}
	
	public void printList(){
		
		if(this.isEmpty()){
			System.out.println("Empty list");
		}else{
			
			Node node = this.head;
			
			System.out.println("" + node.getData());
			
			while(node.getNext() != null){
				node = node.getNext();
				System.out.println("" + node.getData());
			}
			
			
		}
	}
	
}