package homework_11;

import java.util.Arrays;

/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
 */


public class Task1 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 0, 7, 5, 6};
        int result = sumArray(digits);

        System.out.println(result);
    }

    public static int sumArray(int[] numbers) {

        if (numbers == null || numbers.length == 0) return 0;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}








