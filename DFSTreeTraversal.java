// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = new Node(1);
        bTree.root.left = new Node(2);
        bTree.root.right = new Node(3);
        bTree.root.left.left = new Node(4);
        bTree.root.left.right = new Node(5);
        bTree.root.left.right.left = new Node(6);
        BinaryTree.printPreOrder(bTree);
        BinaryTree.printInOrder(bTree);
        BinaryTree.printPostOrder(bTree);
    }
    
    public static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    
    public static class BinaryTree {
        Node root;
        BinaryTree() {
            this.root = null;
        }
        
        public static void printPreOrder(BinaryTree tree) {
            System.out.println("PreOrder traversal:");
            printPreOrder(tree.root);            
        }
        
        public static void printPreOrder(Node node) {
            if (node == null)
                return;
            else {
                System.out.println("Node: " + node.val);
                printPreOrder(node.left);
                printPreOrder(node.right);
            }
        }
        
        public static void printInOrder(BinaryTree tree) {
            System.out.println("InOrder traversal:");
            printInOrder(tree.root);            
        }
        
        public static void printInOrder(Node node) {
            if (node == null)
                return;
            else {
                printInOrder(node.left);
                System.out.println("Node: " + node.val);
                printInOrder(node.right);
            }
        }
        
        public static void printPostOrder(BinaryTree tree) {
            System.out.println("PostOrder traversal:");
            printPostOrder(tree.root);            
        }
        
        public static void printPostOrder(Node node) {
            if (node == null)
                return;
            else {
                printPostOrder(node.left);
                printPostOrder(node.right);
                System.out.println("Node: " + node.val);
            }
        }
    }
}
