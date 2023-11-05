package Recursion;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
//       int value = print_n_numbers(4);
//        System.out.println(value);
        int[] arr = {1,2,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(palindrome(arr, 0, arr.length - 1));

    }
    static int print_n_numbers(int n){
        if (n<=0) {
            return 1;
        }
        return n * print_n_numbers(n-1);
    }

    static void reverse(int[] arr, int i, int j){
        if (i >= (int) arr.length/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        rev(arr, i+1, j-1);
    }

    static boolean palindrome(int[] arr, int i, int j){
        if (i >= (int) arr.length/2){
            return true;
        }
        if (arr[i] != arr[j]){
                return false;
        }
        return palindrome(arr, i+1, j-1);
    }




}
