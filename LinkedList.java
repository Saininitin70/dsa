
public class LinkedList {
    
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = list.new Node(1);
        Node second = list.new Node(2);
        Node third = list.new Node(3);
        list.head.next = second;
        second.next = third;
        list.printList();
    }
}
    