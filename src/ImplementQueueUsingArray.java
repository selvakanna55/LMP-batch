public class ImplementQueueUsingArray {
    static final int MAX = 10000;
    static int rear = 0;
    static int front = 0;
    static int[] a = new int[MAX];

    public static void enqueue(int x, int k) {
        if (rear < k) {
            a[rear] = x;
            rear++;
        } else System.out.println("Queue is full");
    }


    public static void dequeue() {
        if (rear <= front) System.out.println("Queue is empty");
        else front++;
    }

    public static void displayfront() {
        if (rear <= front) System.out.println("Queue is empty");
        else System.out.println(a[front]);
    }


    public static void main(String[] args) {

    }
}
