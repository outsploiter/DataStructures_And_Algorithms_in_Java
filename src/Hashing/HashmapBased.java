package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class HashmapBased {
    public static void main(String[] args) {
        // how to create hashmap
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] arr = {1, 2, 2, 3, 3, 4, 4, 4, 4, 1, 2, 3, 4};
        // When you are asked multiple question/actions from the same array(0 to 9)
        // 1. what is the frequency of the numbers in the given array
        HashMap<Integer, Integer> arr_freq = find_frequency(arr);
//        System.out.println(arr_freq);

        String str = "aaoaz";
        // 2. Find the frequency of char in the given string (a to z)
        HashMap<Character, Integer> str_freq = find_str_frequency(str);
        System.out.println(str_freq);

        // 3. Find value with maximum frequency
//        System.out.println(Arrays.toString(max_frequency(arr_freq)));
//        System.out.println(max_frequency_str(str_freq));

        // 4. Find value with min frequency
        // Try to answer these questions below

        // 5. Two Sum leetcode


    }

    private static HashMap<Character, Integer> find_str_frequency(String str) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            int freq = 0;
            if (hash.containsKey(key)) freq = hash.get(key); // fetching from the map
            freq++;
            hash.put(key, freq); // inserting into the map
        }
        return hash;
    }

    private static HashMap<Integer, Integer> find_frequency(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = 0;
            if (hash.containsKey(key)) freq = hash.get(key); // fetching from the map
            freq++;
            hash.put(key, freq); // inserting into the map
        }
        return hash;
    }
}
