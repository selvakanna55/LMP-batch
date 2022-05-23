import java.util.*;
import java.util.LinkedList;

class Queues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    //Function to push an element into stack using two queues.
    void push(int a) {
        int size = q1.size();
        q1.add(a);
        while (size > 0) {
            int curr = q1.poll();
            q1.offer(curr);
            size--;
        }
    }

    //Function to pop an element from stack using two queues. 
    int pop() {
        if (!q1.isEmpty()) return q1.poll();
        return -1;
        // Your code here
    }
}