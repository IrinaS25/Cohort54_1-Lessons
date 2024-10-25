package homework_07;

//Task 1
//Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
//
//Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)


import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на выбор 1, 2 или 3: ");
        int digits;
        digits = scanner.nextInt();
        scanner.nextLine();

        if (digits == 1) {
            System.out.println("Вы ввели число один");
        } else if (digits == 2) {
            System.out.println("Вы ввели число Два");
        } else if (digits == 3) {
            System.out.println("Вы ввели число Три");
        } else  {
            System.out.println("Таких чисел нет");
        }


            }
        }





