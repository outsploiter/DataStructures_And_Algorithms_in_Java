package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExplained {
    public static void main(String[] args) {
        // ArrayList<datatype> variable_name = new ArrayList<>(size);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(69);
        System.out.println(list);
        System.out.println(list.get(0));
        list.add(78);
        list.set(0, 100);
        System.out.println(list);


        // matrix of dynamic array list <list of list>
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        // create object for every arraylist in that list
        for (int row=0; row<3; row++){
            matrix.add(new ArrayList<>());
        }
        // add data to each array list
        for (int row=0; row<3; row++){
            for (int col=0; col<3; col++) {
                matrix.get(row).add(in.nextInt());
            }
        }
        System.out.println(matrix);
    }
}
