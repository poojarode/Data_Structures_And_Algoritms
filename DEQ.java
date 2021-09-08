class Qued<E>{

	static class Node<E>{
		E data;
		Node<E> next;
		Node<E> prev;
		public Node(E data){
			this.data = data;
			next = null;
			prev = null;
		} 
	}

	Node<E> head, rear;

	E dequeeFirst() {
		Node<E> temp = head;
		if(head == null)
			return null;
		
			head = head.next;
			head.prev = null;
			

			if (head == null) {
				rear = null;
			}
		return temp.data;
		
	}
	E dequeeLast() {
		Node<E> temp = head;
		if(head == null)
			return null;
		
		if(head == rear)
			head = rear = null;

			rear.prev.next = null;
			rear.next =null;
			rear = rear.prev;
			
			
		return temp.data;
		
	}
	void enqueLast(E data) {
		Node<E> toAdd = new Node(data);
		Node<E> temp = rear;
		if(head == null){
			head = rear = toAdd;
			return;
		}
			rear.next = toAdd;
			toAdd.prev = rear;
			rear = rear.next;
	}
void enqueFirst(E data) {
		Node<E> toAdd = new Node(data);
		Node<E> temp = head;
		if(head == null){
			head = rear = toAdd;
			return;
		}
			toAdd.next = head;
			head.prev = toAdd;
			head = toAdd;

	}
	void print(){
		if(rear == null)
			System.out.println("There's nothing to print");
		else{
			Node<E> temp = head;
			while(temp != rear.next){
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
}

public class DEQ{
	public static void main(String[] args) {
		
		Qued<String> q = new Qued<String>();
		q.enqueLast("ritu");
		q.enqueFirst("pooja");
q.enqueFirst("yash");
q.enqueLast("montya");
		System.out.println(q.dequeeLast()+ " deleted");
		System.out.println(q.dequeeFirst()+ " deleted");
		//System.out.println(q.dequee()+ " deleted");
		//System.out.println(q.dequee()+ "deleted");
		
		q.print();
		
		}
}