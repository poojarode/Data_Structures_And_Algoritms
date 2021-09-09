
class Node{
	int data;
	Node left, right;
	public Node(int data){
		this.data = data;
		left = right = null;
	}
}

class Tree{
	public static void main(String[] args) {
		Node root = new Node(5);
		
		 
		 //bt.root = new Node(10);
		 root.left = new Node(20);
		 root.right = new Node(30);
		 root.left.right = new Node(40);
		 root.left.left = new Node(50);
		 preTraverse(root);
		 System.out.println();
		 postTraverse(root);
		 System.out.println();
		 inTraverse(root);
	}
	
	public static void preTraverse(Node node){
		if(node==null) {
			return;
		}
		System.out.print(" " + node.data);
		preTraverse(node.left);
		preTraverse(node.right);
	
	}
	public static void postTraverse(Node node){
		if (node==null) {
			return;
		}
		postTraverse(node.left);
		postTraverse(node.right);
		System.out.print(" " + node.data);
		
	}
	public static void inTraverse(Node node){
		if (node==null) {
			return;
		}

		inTraverse(node.left);
		System.out.print(" " + node.data);
		inTraverse(node.right);
	}

}