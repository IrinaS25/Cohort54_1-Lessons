package homework_11;
/*
Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).

 */
public class Task2 {
    public static void main(String[] args) {

        double [] digits ={1, 2, 3, 4, 5, 6};
        double result = average(digits);

        System.out.println(result);
    }

    public static double average (double []numbers){


        if (numbers == null || numbers.length == 0)
            return 0;


        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];


    }
        return (double) sum / numbers.length;
    }
}
