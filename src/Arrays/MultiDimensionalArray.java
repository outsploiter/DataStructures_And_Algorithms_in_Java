package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size no of rows and columns of array");
        int rows = in.nextInt();
        int columns = in.nextInt();

        int[][] matrix = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("Enter "+i+", "+j+" th element: ");
                matrix[i][j] = in.nextInt();
            }
        }

        // printing the whole array
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        // access
        System.out.println(matrix[0][1]);

        // 2D array with uneven size not matrix
        int [][] arr2D = {
                {1,2},
                {3,4,5},
                {5,6,7,8}
        };
    }
}
