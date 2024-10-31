package homework_14;

/*
Task 1
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */
public class Task1 {
    public static void main(String[] args) {

        int[] digits = {1, 2, 3, 4, 5, 6};
        int result = sumOfEvenNumbers(digits);
        System.out.println(result);

    }// End main
    public static int sumOfEvenNumbers(int[]array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];

            }
        }
        return sum;
    }
}// End Class
