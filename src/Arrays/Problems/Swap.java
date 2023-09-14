package Arrays.Problems;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i1 = 0;
        int i2 = 4;
        System.out.println(Arrays.toString(arr));
        swapindex(arr, i1, i2);
        System.out.println(Arrays.toString(arr));
    }

    private static void swapindex(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
