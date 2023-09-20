package Arrays.Search;

public class SearchInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,78,79,80,555,666,777,888,889,999,1999,2000,3000};
        int target = 35;
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end;
            int len = (end-start) + 1;
            end = len * 2 + end;
            start = temp + 1;
        }
        System.out.println(binary_Search(arr, target, start, end));
    }
    private static int binary_Search(int[] arr, int target, int start, int end) {
        while (start<=end){
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
