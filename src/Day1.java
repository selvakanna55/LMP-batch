import java.util.*;

public class Day1 {
    public int peakElement(int[] arr, int n) {
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (i != n - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) ans = i;
            if (i == n - 1 && arr[i] > arr[i - 1]) ans = i;
        }
        return ans;
    }

    public void reverseArray() {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int l = 0, r = n - 1;
            int s = 0;
            int e = n - 1;
            while (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    int findFrequency(int A[], int x) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) count++;
        }
        return count;
    }

    public void segregateElements(int arr[], int n) {
        int positive[] = new int[n];
        int negative[] = new int[n];
        int pos = 0, neg = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive[pos] = arr[i];
                pos++;
            } else {
                negative[neg] = arr[i];
                neg++;
            }
        }
        int j = 0;
        for (int i = 0; i < pos; i++) {
            arr[j] = positive[i];
            j++;
        }

        for (int i = 0; i < neg; i++) {
            arr[j] = negative[i];
            j++;
        }
    }

    public static int doUnion(int a[], int n, int b[], int m) {
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            s.add(a[i]);
        }
        for (int j = 0; j < m; j++) {
            s.add(b[j]);
        }
        return s.size();
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> obj = new HashMap<>();
        int arr[] = {1, 2, 3, 1, 2, 5};

        for (int i = 0; i < arr.length; i++) {
//            if (obj.containsKey(arr[i])) {
//                int count = obj.get(arr[i]);
//                obj.put(arr[i], count+1);
//            } else {
//                obj.put(arr[i], 1);
//            }
            obj.put(arr[i], obj.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(obj);
    }
}
