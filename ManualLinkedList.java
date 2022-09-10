public class ManualLinkedList {
    
    static class Node {
        int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    Node first = null;
    
    public void addAtFront(Node node) {
        node.next = first;
        first = node;
    }
    
    public void addAtEnd(Node node) {
        if (first == null)
            first = node;
        else {
            Node ptr = first;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = node;
        }
    }
    
    public void removeFront() {
        first = first.next;
    }
    
    public void print() {
        if (first == null)
            System.out.println("Empty linked list!");
        else {
            Node ptr = first;
            while (ptr.next != null) {
                System.out.print(ptr.value + " -> ");
                ptr = ptr.next;
            }
            System.out.println(ptr.value);
        }
    }
    
    public static void main(String[] args) {
        ManualLinkedList linkList = new ManualLinkedList();
        linkList.addAtFront(new Node(4));
        linkList.addAtFront(new Node(8));
        linkList.addAtFront(new Node(1));
        linkList.print();
        linkList.removeFront();
        linkList.addAtEnd(new Node(5));
        linkList.addAtEnd(new Node(0));
        linkList.addAtFront(new Node(9));
        linkList.print();
    }
    
}