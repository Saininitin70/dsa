import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userstack
{
    private int top;
    private final int maxSize;
    private final int[] stackArray;
    
    public userstack(int s){
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
        int poppedelement = stackArray[top--];
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
    public void show(){
        for(int i = 0; i <= top; i++){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    
    public static void main(String[] args) throws IOException{
        
       
        
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements in the stack");
        int n = Integer.parseInt(Br.readLine());
        int[] arr = new int[n];
        
        userstack theStack = new userstack(n);
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the element");
            arr[i] = Integer.parseInt(Br.readLine());
            theStack.push(arr[i]);
        }        
        theStack.show();
        theStack.pop();
        theStack.pop();
        theStack.show();

        System.out.println("Top Element of the stack is " + theStack.top());

        System.out.println("is stack empty? " + theStack.isEmpty());
        System.out.println("is stack full? " + theStack.isFull());
        
        }
    }    