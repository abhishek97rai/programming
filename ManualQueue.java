public class ManualQueue {
    
    static class Node {
        int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    Node front = null;
    Node back = null;
    
    public void enqueue(Node node) {
        if (front == null && back == null) {
            front = node;
            back = node;
        } else {
            back.next = node;
            back = node;
        }
    }
    
    public void dequeue() {
        front = front.next;
        if (front == null)
            back = null;
    }
    
    public void print() {
        if (front == null && back == null)
            System.out.println("Empty queue!");
        else {
            System.out.println("Queue from front to back:");
            Node ptr = front;
            while (ptr.next != null) {
                System.out.print(ptr.value + " -> ");
                ptr = ptr.next;
            }
            System.out.println(ptr.value);
        }
    }
    
    public static void main(String[] args) {
        ManualQueue queue = new ManualQueue();
        queue.enqueue(new Node(4));
        queue.enqueue(new Node(8));
        queue.enqueue(new Node(1));
        queue.print();
        queue.dequeue();
        queue.enqueue(new Node(5));
        queue.enqueue(new Node(9));
        queue.print();
    }
    
}