import java.util.LinkedList;
import java.util.Queue;

public class q {
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue: " + queue);

        // Dequeue elements
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue: " + queue);

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}