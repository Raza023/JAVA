import java.util.*;

public class App 
{
    public static void main(String args[])
    {
    	BST tree = new BST();

		tree.insert(new Node(5));
		tree.insert(new Node(1));
		tree.insert(new Node(9));
		tree.insert(new Node(2));
		tree.insert(new Node(7));
		tree.insert(new Node(3));
		tree.insert(new Node(6));
		tree.insert(new Node(4));
		tree.insert(new Node(8));

		System.out.println("\nInOrder tree traversal: ");
		tree.inorderTraversal();

		System.out.println("\nPreOrder tree traversal: ");
		tree.preorderTraversal();

		System.out.println("\nPostOrder tree traversal: ");
		tree.postorderTraversal();

		System.out.println("\nLevelOrder tree traversal: ");
		tree.levelOrderTraversal();

		System.out.println("\nZigZagOrder tree traversal: ");
		tree.ZigZagTraversal();

		System.out.println("Height of tree: "+tree.getHeight());
		
    }
}
