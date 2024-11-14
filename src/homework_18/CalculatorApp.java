package homework_18;

public class CalculatorApp {
    public static void main(String[] args) {

        double sum = Calculator.add(1, 10);

        System.out.println(Calculator.add(3, 5));
        System.out.println(Calculator.sub(67, 8));
        System.out.println(Calculator.mult(5, 5));
        System.out.println(Calculator.divis(1, 0));
        System.out.println(Calculator.add(1,3));



        int a = 10;
        int b = 0;
        double result;
        double x = 10;
        result = x / 0;
        System.out.println("result: " + result);

        double infinity = 1999 / 0.00;
        System.out.println(infinity);

        System.out.println(infinity > result);
        System.out.println(infinity == result);
        System.out.println(infinity / result);
        System.out.println(1 / infinity);
        System.out.println(infinity + 1555000);
        System.out.println(infinity - 1000);
        System.out.println(infinity - result);

        double minusInfinity = -1999 / 0.0;

        System.out.println(minusInfinity);
        System.out.println(infinity > minusInfinity);


    }
}
