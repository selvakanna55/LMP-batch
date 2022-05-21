import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day6 {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') st.push(ch);
            else if (!st.isEmpty()) st.pop();
            else return false;
        }
        if (st.isEmpty()) return true;
        return false;
    }

    static boolean ispar(String x) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (!stack.isEmpty() && stack.peek() == ch) stack.pop();
            else return false;
        }
        if (stack.isEmpty()) return true;
        else return false;
        // add your code here
    }



    public static void main(String[] args) {
        String s = "(()";
//        System.out.println(isValid(s));
        Queue<Integer> q = new LinkedList<>();
//        Queue<Integer> q2 = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q.poll()); //remove dequeue
        System.out.println(q.peek());

    }
}
