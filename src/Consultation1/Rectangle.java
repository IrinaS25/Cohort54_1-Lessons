package Consultation1;

public class Rectangle {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int p = perimeter(a, b);
        System.out.println(p);


    }//End main

    public static int perimeter (int m, int n){

        int z = 2 * (m + n);

        return z;
    }


}// End Class
