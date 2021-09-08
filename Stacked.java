
import java.util.Scanner;

class LiList{

static class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		next = null;
	}
}

Node head;
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
		}else if(temp.next == null){
			System.out.println(head.data + " deleted");
			head = null;
			return;
			
		}
		while(temp.next.next != null){
			temp = temp.next;
		}
		System.out.println(temp.next.data + "deleted");
		temp.next = null;
	return;
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

public class Stacked{
	public static void main(String[] args) {
		LiList l = new LiList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.delete();
		l.print();
	}
} 