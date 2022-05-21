class QueueArray{
    int size;
    int arr[];
    int front = 0, rear = 0;
    QueueArray(int size){
        this.size = size;
        this.arr = new int[size];
    }

    void enqueue(int val){
        if(rear<size){
            arr[rear] = val;
            rear++;
        }
        else System.out.println("Queue is full");
    }

    void dequeue(){
        if(front<rear){
            System.out.println("deleting "+arr[front]);
            front++;
        }else System.out.println("Queue is Empty");
    }
}
public class QueueExample {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);
        q.dequeue(); // empty
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40); // full
        q.dequeue(); //10
        q.dequeue();//20
        q.dequeue();///30
        q.dequeue(); // empty


    }
}
