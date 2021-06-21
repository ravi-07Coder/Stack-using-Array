package implementation;
import myinterface.StackADT;
public class MyStack implements StackADT {
//maximum number of elements in stack
    private  final int MAX_CAPACITY;
    //array to store elements of stack
    int []arr;
    //top is the index to insert and delete
    int top;

    public MyStack(int MAX_CAPACITY)
    {
     this.MAX_CAPACITY=MAX_CAPACITY;
    //create an array
        arr=new int[MAX_CAPACITY];
        top=0;
    }//end of constructor
    @Override
    public void push(int element) {
        if (top!=MAX_CAPACITY)
        {
            arr[top]=element;
            top++;//top will always be there at the one above the inserted index
        }
        else
            System.out.println("stack overflow");
    }//end of push

    @Override
    public int pop() {
        int response=0;
        if (!isEmpty())
        {       top--;
        response=arr[top];
        }
        else
            System.out.println("stack underflow");
        return response;
    } //end of the pop method

    @Override
    public int peek() {
    int response=0;//consedering 0 as invalid
     if (!isEmpty())
        response= arr[top-1];
    else
     {
         System.out.println("stack is empty");
     }
    return response;
    }

    @Override
    public boolean isEmpty() {
        return top==0;
    }

    @Override
    public int size() {
        return top;
    }
}//end of the class
