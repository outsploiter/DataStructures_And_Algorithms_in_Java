package Arrays.Problems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8 , 9 , 11};
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            swapindex(arr, i, j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swapindex(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
