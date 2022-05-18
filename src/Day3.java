import java.util.ArrayList;

public class Day3 {
    public String excelColumn(int n) {
        String res = "";
        while (n > 0) {
            n--;
            int curr = n % 26;
            char ch = (char) (curr + (int) 'A');
            res = ch + res;
            n = n / 26;
        }
        return res;
    }

    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int i = -1, j = -1, mini = Integer.MAX_VALUE;
        for (int k = 0; k < s.size(); k++) {
            if (s.get(k).equals(word1)) i = k;
            if (s.get(k).equals(word2)) j = k;
            if (i != -1 && j != -1) {
                int diff = Math.abs(i - j);
                if (diff < mini) mini = diff;
            }
        }
        return mini;
    }

    String convertToRoman(int n) {
        int key[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String val[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String ans = "";
        for (int i = 0; i < key.length; i++) {
            while (key[i] <= n) {
                ans += val[i];
                n -= key[i];
            }
            if (n == 0) break;
        }
        return ans;
    }


    String findSum(String X, String Y) {
        int xl = X.length();
        int yl = Y.length();

        int carry = 0;
        StringBuilder sb = new StringBuilder("");

        int i = xl - 1, j = yl - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int a = 0, b = 0, sum = 0;
            if (i >= 0) a = X.charAt(i) - '0';
            if (j >= 0) b = Y.charAt(j) - '0';
            sum = a + b + carry;
            sb.append(Integer.toString(sum % 10));
            carry = sum / 10;
            i--;
            j--;
        }
        i = sb.length() - 1;
        while (sb.charAt(i) == '0' && i > 0) {
            sb.deleteCharAt(i);
            i--;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

    }
}
