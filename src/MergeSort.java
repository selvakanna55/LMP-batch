public class MergeSort {
    void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        //crate temp arr
        int temp1[] = new int[n1];
        int temp2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            temp1[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            temp2[j] = arr[mid + j + 1];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (temp1[i] < temp2[j]) arr[k++] = temp1[i++];
            else arr[k++] = temp2[j++];
        }

        while (i < n1) arr[k++] = temp1[i++];
        while (j < n2) arr[k++] = temp2[j++];

    }

    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
}
