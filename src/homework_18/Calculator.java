package homework_18;
/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.

 */

public class Calculator {

    public static double add(double x, double y){
        return x + y;
    }
    public static double sub (double x, double y){
        return x - y;
    }
    public static double mult (double x, double y){
        return x * y;
    }
    public static double divis (double x, double y){
        System.out.println("double division");
        return x / y;

    }
    public static  int divide (int x, int y){
        System.out.println("int division");
        return x / y;
    }

}
