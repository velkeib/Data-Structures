package LinkedList;

public class Main{
	public static void main(String[] args){
		
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add(5);
		list.add(10);
		list.add(20);
		
		list.printList();
		
		System.out.println(list.get(3));
		
		list.add(2, 30);
		list.add(1, 40);
		list.add(0, 50);
		
		list.printList();
		
	}
}