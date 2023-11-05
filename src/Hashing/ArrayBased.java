package Hashing;

import java.util.Arrays;

public class ArrayBased {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,4,4,1,2,3,4};
        // When you are asked multiple question/actions from the same array(0 to 9)
        // 1. what is the frequency of the numbers in the given array
        int[] arr_freq = find_frequency(arr);
        System.out.println(Arrays.toString(arr_freq));

        String str = "aaoaz";
        // 2. Find the frequency of char in the given string (a to z)
        int[] str_freq = find_str_frequency(str);
//        System.out.println(Arrays.toString(str_freq));

        // 3. Find value with maximum frequency
        System.out.println(Arrays.toString(max_frequency(arr_freq)));
//        System.out.println(max_frequency_str(str_freq));

        // 4. Find value with min frequency

        // 5. Two Sum leetcode


    }

    private static int[] max_frequency(int[] arrFreq) {
        int max = 0;
        int value = 0;
        for (int i=0; i<arrFreq.length; i++){
            if (arrFreq[i] > max){
                max = arrFreq[i];
                value = i;
            }
        }
        return new int[]{value, max};
    }

    private static int[] find_str_frequency(String str) {
        int[] str_hash = new int[26]; // total number of possible chars are 26: (a,z)
        for (int i=0; i < str.length(); i++ ){
            str_hash[str.charAt(i)-'a'] += 1;
        }
        return str_hash;
    }

    private static int[] find_frequency(int[] arr) {
        int[] arr_hash = new int[9];

        for(int i=0; i<arr.length; i++){
            arr_hash[arr[i]] += 1;
        }

        return arr_hash;
    }
}
