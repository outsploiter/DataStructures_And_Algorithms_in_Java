package Patterns;

public class PatternPrint {
    public static void main(String[] args) {
        System.out.println("hi");
        pattern7_dup(5);
    }

    static void pattern1(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<=row;col++){
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<n-row; col++){
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int row=0; row<n; row++) {
            for(int zeros=0; zeros<n-row-1;zeros++) {
                System.out.print(" ");
            }
            for(int stars=0; stars<2*row+1; stars++){
                System.out.print("*");
            }
            for(int zeros=0; zeros<n-row-1;zeros++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row=n-1; row>=0; row--) {
            for(int zeros=0; zeros<n-row-1;zeros++) {
                System.out.print("@");
            }
            for(int stars=0; stars<2*row+1; stars++){
                System.out.print("*");
            }
            for(int zeros=0; zeros<n-row-1;zeros++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    static void pattern7_dup(int n){
        for(int row=0; row<n; row++){
            for(int zeros=0; zeros<row; zeros++){
                System.out.print("@");
            }
            for(int stars=0; stars<(2*n)-(2*row+1); stars++){
                System.out.print((2*n)-(2*row+1));
//                System.out.print("*");
            }
            for(int zeros=0; zeros<row; zeros++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
