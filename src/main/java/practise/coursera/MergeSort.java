package practise.coursera;

/**
 * Created by Rohith on 02-11-2015.
 */
public class MergeSort {
    static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = left + (right-left)/2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            int i = left, j = mid + 1;
            int[] b = a.clone();
            for (int k = left; k <= right; k++) {
                if ((j > right) || (b[i] < b[j])) {
                    a[k] = b[i];
                    i++;
                } else if ((i > mid) || b[i] > b[j]) {
                    a[k] = b[j];
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {100, 20, 4, 3,1};
        mergeSort(a,0,a.length-1);
        for(int num : a)
            System.out.println(num);
    }
}
