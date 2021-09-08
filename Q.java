class Qued<E>{

	static class Node<E>{
		E data;
		Node<E> next;
		public Node(E data){
			this.data = data;
			next = null;
		} 
	}

	Node<E> head, rear;

	E dequee() {
		Node<E> temp = head;
		if(head == null)
			return null;
		
			head = head.next;
			

			if (head == null) {
				rear = null;
			}
		return temp.data;
		
	}
	void enquee(E data) {
		Node<E> toAdd = new Node(data);
		Node<E> temp = rear;
		if(head == null){
			head = rear = toAdd;
			return;
		}
			rear.next = toAdd;
			rear = rear.next;
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

public class Q{
	public static void main(String[] args) {
		
		Qued<String> q = new Qued<String>();
		q.enquee("ritu");
		q.enquee("pooja");
		q.enquee("yash");
		
		System.out.println(q.dequee()+ " deleted");
		//System.out.println(q.dequee()+ "deleted");
		
		q.print();
		
		}
}