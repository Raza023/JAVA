public class App {
    public static void main(String[] args) throws Exception {

        AVL avl = new AVL();

        Node root = null;

        // example
        root = avl.insert(root, 55);
        root = avl.insert(root, 45);
        root = avl.insert(root, 65);
        root = avl.insert(root, 43);
        root = avl.insert(root,100);
        root = avl.insert(root, 200);

        avl.display(root);

        //LL example
        // root = avl.insert(root, 50);
        // root = avl.insert(root, 30);
        // root = avl.insert(root, 80);
        // root = avl.insert(root, 20);
        // root = avl.insert(root,40);
        // root = avl.insert(root, 10);

        // avl.display(root);

        //RR example
        // root = avl.insert(root, 50);
        // root = avl.insert(root, 30);
        // root = avl.insert(root, 80);
        // root = avl.insert(root, 70);
        // root = avl.insert(root,90);
        // root = avl.insert(root, 95);

        // avl.display(root);

        //LR example
        // root = avl.insert(root, 50);
        // root = avl.insert(root, 30);
        // root = avl.insert(root, 80);
        // root = avl.insert(root, 20);
        // root = avl.insert(root,40);
        // root = avl.insert(root, 35);

        // avl.display(root);

        //RL example
        // root = avl.insert(root, 50);
        // root = avl.insert(root, 30);
        // root = avl.insert(root, 80);
        // root = avl.insert(root, 70);
        // root = avl.insert(root,90);
        // root = avl.insert(root, 75);

        // avl.display(root);
    }
}
