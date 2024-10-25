package Homework_05;

import java.util.Scanner;

//Task 1
//Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
//Используя Scanner, сохраните имя в переменную типа String.
//Выведите на экран количество символов в имени пользователя.
//Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
//Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.


public class Task1 {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        System.out.println("Напиши имя с клавиатуры: ");
        String name = Name.nextLine();

        int length = name.length();
        System.out.println("Количество символов в имени пользователя: " + length);

        char Firstletter = name.charAt(0);
        char Lastletter = name.charAt(length -1);
        System.out.println("Firstletter: " + (int) Firstletter);
        System.out.println("Lastletter: " + (int) Lastletter);








    }
}
