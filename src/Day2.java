import java.util.HashMap;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}


public class Day2 {
    static pair getMinMax(long arr[], long n) {

        int small = 0;
        int largest = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
            if (arr[i] < arr[small]) {
                small = i;
            }
        }
        pair ans = new pair(arr[small], arr[largest]);
        return ans;
    }

    public void rotate(int arr[], int n) {
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }


    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int y = k - arr[i];
            if (hm.containsKey(y)) {
                ans += hm.get(y);
            }
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        return ans;
    }

    long maxSubarraySum(int arr[], int n) {
        long maximumSum = arr[0];
        long currSum = 0;
        int start = 0, end = 0, newStart = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (maximumSum < currSum) {
                start = newStart;
                end = i;
                maximumSum = currSum;
            }

            if (currSum < 0) {
                newStart = i + 1;
                currSum = 0;
            }
        }
        return maximumSum;
    }

    int MissingNumber(int array[], int n) {
        int xor = 0;
        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }

        for (int i = 0; i < n - 1; i++) {
            xor = xor ^ array[i];
        }
        return xor;
    }

    String reverseWords(String S) {
        int n = S.length();
        int prevDot = n;
        StringBuffer sb = new StringBuffer();
        for (int i = n - 1; i >= 0; i--) {
            if (S.charAt(i) == '.') {
                String curr = S.substring(i + 1, prevDot);
                prevDot = i;
                sb.append(curr);
                sb.append(".");
            }
        }
        String curr = S.substring(0, prevDot);
        sb.append(curr);
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
