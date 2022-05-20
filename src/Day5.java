import java.util.HashMap;

public class Day5 {
    static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) sum--;
            else sum++;
            if (sum == 0) count++;

            if (hm.containsKey(sum)) count += hm.get(sum);
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
        // add your code here
    }

    public int romanToDecimal(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int sum = 0;
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);

            if (hm.get(a) >= hm.get(b)) {
                sum += hm.get(a);
            } else {
                sum -= hm.get(a);
            }
            System.out.println(sum);
        }
        char a = str.charAt(n - 1);
        sum += hm.get(a);
        return sum;
    }

    public static void main(String[] args) {

    }
}
