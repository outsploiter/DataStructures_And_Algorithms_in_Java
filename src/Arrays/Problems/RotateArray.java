package Arrays.Problems;
import java.util.Arrays;

public class RotateArray {
    // leetcode 189
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3 % arr.length;
        System.out.print("Before: ");
        System.out.println(Arrays.toString(arr));
        reverse(arr,0, arr.length - k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.print("After rotate : ");
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int[] arr, int start, int end){
        while(start<end){
            swapIndex(arr, start, end);
            start++;
            end--;
        }
    }
    private static void swapIndex(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
