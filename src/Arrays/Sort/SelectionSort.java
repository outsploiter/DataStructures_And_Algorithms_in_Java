package Arrays.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            // find minimum value's index from current position(i) to end (n-1)
            int min_index = find_min(arr, i, n-1);
            // and swap it with the current position i
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int find_min(int[] arr, int start, int end) {
        int min = arr[start];
        int idx = start;
        for(int i=start; i<=end; i++){
            if(min>arr[i]){
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}
