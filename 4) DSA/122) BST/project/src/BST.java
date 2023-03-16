public class BST{
    Node root;

    public void insert(Node node){
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node)
    {
        if(root == null)
        {
            root = node;
            // return root;
        }
        else if(node.data < root.data)
        {
            root.left = insertHelper(root.left, node);
        }
        else
        {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display(){
        displayHelper(root);
    }

    private void displayHelper(Node root){   //in order trevarsal.
        if(root != null)
        {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    
    public boolean search(int data){
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data){
        if(root == null)
        {
            return false;
        }
        else if(data == root.data)
        {
            return true;
        }
        else if(data < root.data)
        {
            return searchHelper(root.left, data);
        }
        else if(data > root.data)
        {
            return searchHelper(root.right, data);
        }
        return false;
    }

    public int remove(int data){
        if(search(data))
        {
            removeHelper(root,data);
            return data;
        }
        else
        {
            System.out.println(data+" could not be found!");
            return -999;
        }
    }

    private Node removeHelper(Node root, int data){
        if(root == null)
        {
            return root;
        }
        else if(data < root.data)
        {
            root.left = removeHelper(root.left,data);
        }
        else if(data > root.data)
        {
            root.right = removeHelper(root.right,data);
        }
        else if(data == root.data) //node found
        {
            if(root.left == null && root.right == null)
            {
                root = null;
            }
            else if(root.right != null)      //find a successor to replace this node
            {
                root.data = successor(root);
                root.right = removeHelper(root.right,root.data);
            }
            else if(root.left != null)     //find a predecessor to replace this node
            {
                root.data = predecessor(root);
                root.left = removeHelper(root.left,root.data);
            }
        }
        return root;
    }

    private int successor(Node root)  //find least value below the right child of this root node
    {
        root = root.right;
		while(root.left != null){
			root = root.left;
		}
		return root.data;
    }
    private int predecessor(Node root) //find largest value below the left child of this root node
    {
        root = root.left;
		while(root.right != null){
			root = root.right;
		}
		return root.data;
    }
    
}