import java.util.*;
import java.io.*;
class Node{
	int data;
	Node left, right;
	public Node(int data){
		this.data = data;
		left = right = null;
	}
}
class Tree1{

	static int leav = 0;
	public static Node buildTree(){
		Node root = null; 
		//BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		int data = sc.nextInt();
		if(data == 0)
			return null;
		root = new Node(data);
		System.out.println("Enter left data for " + data);
	    
		root.left = buildTree();
		System.out.println("Enter right data for " + data);
		
		root.right = buildTree();
		
		return root;
	}
	
	public static void inTraverse(Node node){
		if (node==null) {
			return;
		}

		inTraverse(node.left);
		System.out.print(" " + node.data);
		inTraverse(node.right);
	}
	public static int Count(Node node){
		//static int c = 0;
		if (node==null) 
			return 0;
		
        return Count(node.left) + 1 + Count(node.right);
       
	}
	public static int leaves(Node node){
		//static int c = 0;
		if (node==null) 
			return 0;
		if (node.left == null && node.right == null) {
			return 1;
		}
		
        return leaves(node.left)+leaves(node.right);
       
	}
	public static void main(String[] args) {
		Node root = buildTree();
		//System.out.println(root.data);
		//Node n = null;
		inTraverse(root);
		int c = Count(root);
		System.out.println();
		System.out.println(c);
		int l= leaves(root);
		System.out.println(l);
	}
}
