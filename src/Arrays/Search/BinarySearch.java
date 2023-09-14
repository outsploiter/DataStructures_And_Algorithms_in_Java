package Arrays.Search;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 19;
        int index = binary_Search(arr, target);
        System.out.println(index);
    }

    private static int binary_Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int middle = start + (end-start)/2;
            if (arr[middle] == target){
                return middle;
            } else if (arr[middle] > target) {
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
        return -1;
    }
}
