package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // datatype[] variable_name = new datatype[size]; will have zeros initialized by default
        int[] roll = new int[5];
        // or datatype[] variable = {value1, value2}; has values initialized
        int[] row = {1, 3, 4, 7, 10};

        System.out.println(roll[0]); // will print 0 as default

        // or declare and initialize
        String[] column;
        column = new String[20];

        System.out.println(column[0]); // will print null as default


        // input using loops
        for(int i=0; i<roll.length; i++){
            roll[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(roll));

        // for each loop
        for(int num: roll){
            System.out.println(num);
        }

        String s = "sss";
        System.out.println(s);
        // Array objects are mutable but string are immutable

    }

}