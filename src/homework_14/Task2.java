package homework_14;

import java.util.Arrays;

/*
Task 2
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] digits = {2,13,23,8,1,9};

        Arrays.sort(digits);
        System.out.println(Arrays.toString(digits));

       int secondMax = digits[digits.length -2];
        System.out.println(secondMax);



    }}








