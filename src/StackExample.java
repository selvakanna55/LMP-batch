import java.util.Stack;

class StackArray{
    int size;
    int top = -1;
    int arr[];
    StackArray(int size){
        this.size = size;
        this.arr = new int[size];
    }

    void push(int val){
        //insertion
        if(top<size-1){
            top++;
            arr[top] = val;
        }
        else System.out.println("Stack overflow");
    }
    void pop(){
        if(top>=0){
            System.out.println("deleting "+arr[top]);
            top--;
        }else System.out.println("Stack underflow");
        //deletion
    }

}

public class StackExample {
    public static void main(String[] args) {
        StackArray stack = new StackArray(3);
        stack.pop(); //underflow
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);//overflow
        stack.pop(); //delete 30
        stack.pop(); //delete 20
        stack.push(40);



    }
}
