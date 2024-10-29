package Consultation1;

public class Converter {
    public static void main(String[] args) {
        double change = 120;
        double res = converter(change);
        System.out.println(res);

    }//End Main
    public static double converter (double sum){

        double course = 0.99;

        double result = sum * course;
        return result;
    }




}//End Class

