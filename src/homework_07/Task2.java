package homework_07;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // Task 2
        //Запишите в 4 переменные случайные числа от 0 до 100.
        //Выведите все 4 числа на экран.
        //Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
        //Output:
        //Максимальное число: 33

        Random random = new Random();
        int digits1;
        int digits2;
        int digits3;
        int digits4;
        digits1 = random.nextInt(101);
        digits2 = random.nextInt(101);
        digits3 = random.nextInt(101);
        digits4 = random.nextInt(101);

        // System.out.printf("%d | %d | %d | % d\n ", digits1, digits2, digits3, digits4);
        System.out.println(digits1);
        System.out.println(digits2);
        System.out.println(digits3);
        System.out.println(digits4);
        System.out.println(digits1 + " | " + digits2 + " | " + digits3 + " | " + digits4);

        int max = digits1;
        if (digits2 > digits1){
            max = digits2; }
        if (digits3 > digits2){
         max = digits3; }
        if (digits4 > digits3){
            max = digits4;}
        System.out.println("Максимальное число: " + max);


}
}
