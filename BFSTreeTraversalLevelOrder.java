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
        BinaryTree.printLevelOrder(bTree);
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
        
        public static void printLevelOrder(BinaryTree tree) {
            System.out.println("LevelOrder traversal:");
            Node rootNode = tree.root;
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(rootNode);
            
            while (queue.size() != 0) {
                Node node = queue.poll();
                System.out.println("Node: " + node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }        
    }
}
