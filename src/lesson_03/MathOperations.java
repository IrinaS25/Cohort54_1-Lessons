package lesson_03;

public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        result = 15 + 6 + var1;

        System.out.println("result + : " + result);

       result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        result = var1 * var2;
        System.out.println("var1 * var2 =  " + result);

        result = var1 / var2;
        System.out.println("var1 / var2 = " + result);

        int rest = var1 % var2;
        System.out.println("var1 % var2 = " + rest);

        System.out.println("5 / 10 = " + (5 / 10));
        System.out.println("5 % 10 = " + (5 % 10));

        result = 2 + 10 / 2;
        System.out.println(result);

        result = 2 / 3;
        System.out.println("2 / 3 = " + result);
        System.out.println("2 % 3 = " + 2 % 3);

        result = 2 + 10 / 2;
        result =  (2 + 10) / 2;
        System.out.println(result);

        double x = 20.0;
        double y = 7.0;

        double resultDouble = x / y;
        System.out.println("resultDouble = " + resultDouble);

        int a = 20;
        int b = 7;
        int res = 20 / 7;

        System.out.printf("okruglönnij vivod resultata delenija %f\n", resultDouble);
        System.out.printf("okruglönnij vivod resultata delenija %.4f\n", resultDouble);

        double x1 = 0.1;
        double y1 = 0.2;
        double z = x1 + y1;
        System.out.println("0,1 + 0,2 = " + z);

        x1 = 1.0;
        y1 = 4.0;
        z = x1 / y1;
        System.out.println("z: " + z);








    }
}
