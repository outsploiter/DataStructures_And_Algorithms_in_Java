package Arrays.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 60, 7, 9, 10};
        int target = 6;
        System.out.println("array found in index: "+ linearsearch(arr, target));
        }

    private static int linearsearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
