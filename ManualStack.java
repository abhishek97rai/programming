public class ManualStack {
    
    static class Node {
        int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    Node top = null;
    
    public void push(Node node) {
        node.next = top;
        top = node;
    }
    
    public void pop() {
        top = top.next;
    }
    
    public void print() {
        if (top == null)
            System.out.println("Empty stack!");
        else {
            System.out.println("Below is the stack from top to bottom:");
            Node ptr = top;
            while (ptr.next != null) {
                System.out.println(ptr.value);
                ptr = ptr.next;
            }
            System.out.println(ptr.value);
        }
    }
    
    public static void main(String[] args) {
        ManualStack stack = new ManualStack();
        stack.push(new Node(4));
        stack.push(new Node(8));
        stack.push(new Node(1));
        stack.print();
        stack.pop();
        stack.push(new Node(5));
        stack.push(new Node(9));
        stack.print();
    }
    
}