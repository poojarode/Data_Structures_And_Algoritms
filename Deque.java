
 class DequeImplementation{

 	 static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			next = null;
		}
	}

	Node head, rear;

	public void add(int data)
	{
		Node toAdd = new Node(data);
		if(head == null){
			head = rear = toAdd;
			rear = rear.next;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	public void remove(){
		Node temp = head;
		if(temp == null)
			System.out.println("Ohh come on you can't do this");
		if(temp.next != null)
			head = null;
		System.out.println(head.data + "deleted");
		head = head.next;
	}

	public void print(){
		Node temp = head;
		while(temp.next != null){
			System.out.println("temp.data");
			temp = temp.next;
			
		}
	}
}

public class Deque{
	
	
	public static void main(String[] args) {
		DequeImplementation de = new DequeImplementation();
		de.add(10);
		de.add(20);
		de.print();
		de.add(30);
		de.add(40);
		de.remove();
		de.print();
	}
}
