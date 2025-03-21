public class Stack
{
    private int top;
    private final int maxSize;
    private final int[] stackArray;
    
    public Stack(int s){
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }
    
    public void push(int value){
        if(top == maxSize - 1){
            System.out.println("Stack is full");
            return;
        }
        
        stackArray[++top] = value;
        System.out.println("Pushed into the stack " + value);
    }

    
    public int pop(){

        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedelement = stackArray[top];
        System.out.println("Popped from the stack " + poppedelement);
        return poppedelement;
        
    }
    
    public int top(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    
    public static void main(String[] args){
        Stack theStack = new Stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        System.out.println("Top Element of the stack is " + theStack.top());
        
        //theStack.pop();
        theStack.pop();

        System.out.println("is stack empty? " + theStack.isEmpty());
        System.out.println("is stack full? " + theStack.isFull());
        
        }
}
