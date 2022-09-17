public class BST {
    
    class Node {
        int data;
        Node left, right;
        
        public Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }
    
    Node root;
    
    BST() {
        root = null;
    }
    
    Node search(Node root, int value) {
        if (root == null)
            return null;
        if (root.data == value)
            return root;
        if (root.data < value)
            return search(root.right, value);
        else
            return search(root.left, value);
    }
    
    //insert value into BST and update tree root
    void insert(int value) {
        root = recInsert(root, value);
    }
    
    Node recInsert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data)
            root.left = recInsert(root.left, value);
        else if (value > root.data)
            root.right = recInsert(root.right, value);
        return root;
    }
    
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(8);
        bst.insert(1);
        bst.insert(4);
        bst.insert(7);
        bst.insert(9);
        bst.insert(0);
        bst.insert(2);
        bst.insert(6);
        bst.insert(10);
        
        Node res = bst.search(bst.root, 9);
        if (res == null)
            System.out.println("9 not found...");
        else
            System.out.println("9 found at: " + res);
        res = bst.search(bst.root, 10);
        if (res == null)
            System.out.println("10 not found...");
        else
            System.out.println("10 found at: " + res);
        res = bst.search(bst.root, 11);
        if (res == null)
            System.out.println("11 not found...");
        else
            System.out.println("11 found at: " + res);
    }
    
}