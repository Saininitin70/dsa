class node{
    int data;
    node next;
    public node(int data){
        this.data = data;
        this.next = null;
    }
    
}
class Queue{
    node front, rear;
    int length;
    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }
    void enqueue(int key){
        this.length++;
        node temp = new node(key);
        if(this.rear == null){
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
     void dequeue(){
        if(this.front == null){
            return;
        }

        
        node temp = this.front;
        this.front = this.front.next;
        if(this.front == null){
            this.rear = null;
        }
    
    temp.next = null;
}
    int peek(){
    if(this.front!= null){
    return this.front.data;}

    return Integer.MIN_VALUE;
}

    int size(){
        return this.length;
    }
    void printQueue(){
        node temp = this.front;
        System.out.println("Queue: ");
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
    }

    System.out.println();
}
}
//driver class
public class Queuemain{
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.printQueue();
        System.out.println("Queue size: "+q.size());
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.printQueue();
        System.out.println("size of queue: "+q.size());
        System.out.println("Front element: "+q.peek());
    }
}