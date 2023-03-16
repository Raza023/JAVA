public class AVL {
    
    public int getHeight(Node root)
    {
        if(root == null)
        {
            return 0;           //0 if you want height node-wise otherwise put -1 for edge-wise height.
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        int height = Math.max(lh, rh)+1;
        return height;
    }

    public int getBalanaceFactor(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return getHeight(root.left)-getHeight(root.right);
    }

    public Node rightRotate(Node a)
    {
        Node b = a.left;
        Node br = b.right;
        b.right = a;
        a.left = br;

        a.height = Math.max(getHeight(a.left), getHeight(a.right))+1;
        b.height = Math.max(getHeight(b.left), getHeight(b.right))+1;

        return b;
    }

    public Node leftRotate(Node a)
    {
        Node b = a.right;
        Node bl = b.left;
        b.left = a;
        a.right = bl;

        a.height = Math.max(getHeight(a.left), getHeight(a.right))+1;
        b.height = Math.max(getHeight(b.left), getHeight(b.right))+1;

        return b;
    }

    public Node insert(Node root, int value)
    {
        if(root == null)
        {
            return new Node(value);
        }
        if(value<root.data)
        {
            root.left = insert(root.left, value);
        }
        else if(value>=root.data)
        {
            root.right = insert(root.right, value);
        }

        root.height = Math.max(getHeight(root.left), getHeight(root.right));
        int bf = getBalanaceFactor(root);

        //LL
        if(bf>1 && value < root.left.data)
        {
            return rightRotate(root);
        }

        //RR
        if(bf<-1 && value>root.right.data)
        {
            return leftRotate(root);
        }

        //LR
        if(bf>1 && value > root.left.data)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        //RL
        if(bf<-1 && value<root.right.data)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        
        return root;
    }

    public void inorderDisplay(Node root){
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

    public void display(Node root)
    {
        if (root == null) {
            return;
        }

        String str = "";
        str += root.left == null ? "." : root.left.data + "";
        str += " <- " + root.data + " -> ";
        str += root.right == null ? "." : root.right.data + "";
        System.out.println(str);

        display(root.left);
        display(root.right);
    }

}
