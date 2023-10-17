package Arrays.Search;

import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,10,12,14},
                {11,20,30,40}
        };
        System.out.println(Arrays.toString(search(mat, 40)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length-1; // check if row exists before you proceed with this

        while (row< matrix.length && col >= 0){
            System.out.println(row+" "+col);
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
