import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Day4 {
    int binarysearch(int arr[], int n, int k) {
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == k)
                return mid;
            else if (arr[mid] > k)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return -1;
    }

    public static void merge(long arr1[], long arr2[], int n, int m) {
        long arr[] = new long[m + n];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                k++;
                i++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (j < m) {
            arr[k] = arr2[j];
            k++;
            j++;
        }

        while (i < n) {
            arr[k] = arr1[i];
            k++;
            i++;
        }

        //copying back to old array
        i = 0;
        j = 0;
        k = 0;

        while (i < n) {
            arr1[i] = arr[k];
            k++;
            i++;
        }

        while (j < m) {
            arr2[j] = arr[k];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
//        int arr[] = {10, 9, 11, 14, 6, 1};
//        int target = 999;
//        int index = -1; // element is not found proint -1
//
//        //linear search -> O(n)
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);
        Set<Integer> s = new HashSet<>();
        int arr[] = {1, 1, 3, 5, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        System.out.println(s);
        int k = 5;
        for (int i = 1; i <= k; i++) {
            if (s.contains(i)) continue;
            System.out.print(i + " ");
        }
//        for(int i=0;i<arr.length;i++){
//            boolean status = s.add(arr[i]);
//            if(status==false)
//                System.out.print(arr[i]+" ");
////            }else s.add(arr[i]);
//        }
//
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(hm.containsKey(arr[i])){
//                int count = hm.get(arr[i]);
//                hm.put(arr[i],count+1);
//            }else hm.put(arr[i], 1);
//        }
//
//        System.out.println(hm);
//        System.out.println(hm.keySet());
//        for(int k:hm.keySet()){
//            if(hm.get(k)>1) System.out.print(k+" ");
//        }
    }
}
