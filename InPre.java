class Node{
	int data;
	Node left, right;
	public Node(int data){
		this.data = data;
		left = right = null;
	}
}

class InPre{
	static int idx = 0;
	public static void main(String[] args) {
		
		int preOrder[] = {1,2,4,3,5};
		int inOrder[] = {4,2,1,5,3};
		Node n = buildTree(preOrder, inOrder, 0, 4 );
		System.out.println("in inOrder for given in and pre order");
		 inTraverse(n);
		 System.out.println();
	}

		 public static int search(int in[], int st, int en, int curr){
		for (int i = st; i <= en ;i++ ) {
			if(in[i] == curr)
				return i;
		}
		return 0;
	}
	public static void inTraverse(Node node){
		if (node==null) {
			return;
		}

		inTraverse(node.left);
		System.out.print(" " + node.data);
		inTraverse(node.right);
	}
	public static Node buildTree(int pre[], int in[], int st, int en){
		if(st > en) {
			return null;
		}
		
		int curr = pre[idx];
		idx++;
		Node node = new Node(curr);
		if(st == en) {
			return node;
		}
		int pos = search(in, st, en, curr);
		node.left = buildTree(pre, in , st, pos-1);
		node.right = buildTree(pre, in, pos+1, en);
		return node;
	}
}