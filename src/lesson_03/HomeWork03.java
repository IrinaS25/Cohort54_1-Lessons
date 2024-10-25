package lesson_03;

public class HomeWork03 {
    public static void main(String[] args) {

        int myFullAge;
        myFullAge = 43;
        System.out.println("myFullAge = " + 43);

        double litterMilk;
        litterMilk = 1.99;
        System.out.println("litterMilk = " + 1.99);

        String myName;
        myName = "Irina";
        System.out.println("myName = " + "Irina");

        int v1 = 0;

        int v2 = 1;

        int v3 = 2;

        int v4 = 3;

        int result;

        result = (v1 + v2 + v3 + v4) / 4;
        System.out.println("(v1 + v2 + v3 + v4) / 4 = " + result);

        int rest = (v1 + v2 + v3 + v4) % 4;
        System.out.println("(v1 + v2 + v3 + v4) % 4 = " + rest);

        double a = 1000;
        double b = 500;

        int discount = 10;
        double discountMoney = (a + b) * discount / 100;
        System.out.println("a + b - discount: " + discountMoney);

        double resultDouble = (a + b) / 100 * 90;
        System.out.println("(a + b) / 100 * 90 = " + resultDouble);

        int mo = 12;
        int die = 15;
        int mi = 7;
        int don  =17;
        int fr = 18;
        int sa = 6;
        int so = 11;
         int days = 7;

         int summeTemp = (mo + die + mi + don + fr + sa + so);
        System.out.println("summeTemp: " + summeTemp);

        //86 / 7 = 12 т остаток 2
        // 86.0 / 7 = 12.286

        double averageTemp = (double) summeTemp / days;
        System.out.println("averageTemp: = " + averageTemp);
        System.out.println("rest: " + summeTemp % days);

        //остаток от деления на 2 = 0 или 1
        //остаток от деления на 3 = 0; 1; или 2

        int x = 100;
        System.out.println("x: " + x++);
        System.out.println("x: ");
        
    }
}
