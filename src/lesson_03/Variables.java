package lesson_03;

public class Variables {
    public static void main(String[] args) {
        int myFirstVariable;
        myFirstVariable = 1;
        int mySecondVariable = 25;
        System.out.println(mySecondVariable);
        mySecondVariable = 50;
        System.out.println(mySecondVariable);
        byte byteVariable = 125;
        System.out.println("byteVariable: " + byteVariable);
        byteVariable = -100;
        System.out.println("byteVariable: " + byteVariable);

        short shortVariable;
        shortVariable = 31000;

        System.out.println("shortVariable: " + shortVariable);

        long longVariable = 12_000_000_000L;
        System.out.println("longVariable: " + longVariable);

        double doubleVar = 10.5421;
        System.out.println("doubleVar: " + doubleVar);

        float floatVar = 11.65f;
        System.out.println("floatVar: " + floatVar);


    }
}
