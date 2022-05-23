import java.util.*;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Stack<Integer> stack = new Stack<>();


        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            if (stack.isEmpty()) res[i] = -1;
            else res[i] = stack.peek();
            stack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) System.out.print(res[i] + " ");
    }
}
