import java.util.Scanner;


class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }

}
 class operations{
  public Node addNode(Node node, int val){
    if (node == null) {
      node = new Node(val);
      return node;
    }
    else
    {
      if(val < node.key)
        node.left = addNode(node.left, val);
      else if (val > node.key) 
        node.right = addNode(node.right, val);
      else 
        return node;
    }
    return node;
  }

  public void printTree(Node node){
if (node != null) {
  
  System.out.println(node.key);
  printTree(node.left);
  printTree(node.right);
}
  }
    public void printTree2(Node node){
if (node != null) {
  
  printTree(node.left);
  System.out.println(node.key);
  printTree(node.right);
}
  }
 }
// A Java program to introduce Binary Tree
class BT
{
    // Root of Binary Tree
    Node root = null;
    public static void main(String[] args)
    {
      
       Node root = null;
       operations op = new operations();
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    root = op.addNode(root, val);
    op.addNode(root, sc.nextInt());
    op.addNode(root, sc.nextInt());
    op.addNode(root, sc.nextInt());
    op.addNode(root, sc.nextInt());
    op.printTree(root);
    op.printTree2(root);

        
    }
  }