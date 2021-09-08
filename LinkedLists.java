
import java.util.Scanner;

class LiList{
Node head;
static class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		next = null;
	}
}


public void add(int data){
	Node toAdd = new Node(data);
	Node temp = head;
	if(isEmpty()){
		head = toAdd;
		return;
	}
	while(temp.next != null){
		temp = temp.next;
	}
	temp.next = toAdd;

}

public void addAtFirst(int data){
	Node toAdd = new Node(data);

	if(isEmpty()){
		head = toAdd;
		return;
	}
	toAdd.next = head;
	head = toAdd;
}
public void addAtLoc(int data,int loc){
	Node toAdd = new Node(data);
	Node temp = head;
	int i=0;
	if(isEmpty()){
		head = toAdd;
		return;
	}

	while(i <= loc){
		if(temp.next == null){
			System.out.println("Sorry..Limit exeeted");
			return;}
		temp=temp.next;
		i++;
	}
	toAdd.next = temp.next;
	temp.next = toAdd;
}
public void delete(){
	Node temp = head;
	int i = 0;

		if(temp == null){
			System.out.println("Are you kidding..List is empty");
			return;
		}
		if (temp.next == null) {
			head =null;
		}
		while(temp.next.next != null){
			temp = temp.next;
		}
		int d = temp.data;
		head.next = null;
}
public void print(){
	if(isEmpty()){
		System.out.println("Just go add data to list!! lol ;)");
	}
	Node temp=head;
	while(temp!=null){
		System.out.println(temp.data);
		temp = temp.next;
	}

}
public boolean isEmpty(){
	return head ==null;
} 

} 
public class LinkedLists{
	public static void main(String[] args) {
		LiList ll = new LiList();
		
		//for (int i=0;i<5 ;i++ ) {
		//	Scanner sc = new Scanner(System.in);
		//	ll.add(sc.nextInt());	
		//}
		ll.add(10);
		ll.add(40);
		ll.add(30);
		ll.add(10);
		ll.add(40);
		ll.add(30);
		//ll.addAtFirst(70);
		//ll.addAtLoc(40,1);
		//ll.addAtLoc(50,2);
		ll.delete();
			System.out.println("Printing");
		ll.print();
			}
}