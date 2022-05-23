import java.util.*;

class StackQueue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x) {
        int curr = s1.pop();
    }


    //Function to pop an element from queue by using 2 stacks.
    int Pop() {
        //empty???
        if (s1.isEmpty() && s2.isEmpty()) return -1;
        //copy?
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                int curr = s1.pop();
                s2.push(curr);
            }
        }
        return s2.pop();
    }
}
