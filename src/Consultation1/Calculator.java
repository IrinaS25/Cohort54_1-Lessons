package Consultation1;

public class Calculator {

    public static void main(String[] args) {
        int a = 7;
        int b = 23;
       // int result = a * b;

        int result = multiplication(a, b);

        System.out.println(result);


    } // End of main

    public static int multiplication (int x, int y) {
        int res = x * y;
        return res;
    }



}// End of Clas
