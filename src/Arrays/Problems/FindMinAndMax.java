package Arrays.Problems;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 3, 4, 5, 9};
        System.out.println(findMax(nums));
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] arr) {
        if (arr.length <= 0){
            return -1;
        }
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    private static int findMax(int[] arr){
        if (arr.length <= 0){
            return -1;
        }
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
