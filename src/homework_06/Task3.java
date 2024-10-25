package homework_06;

//Task 3
//Попросите пользователя ввести целое число с клавиатуры.
//Ваша программа должна вывести строку в формате:
//Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
//Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
//Copy
//Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int input = scanner.nextInt();
        boolean a = input % 2 == 0;
        boolean b = input % 3 == 0;
        boolean c = a && b;
        System.out.printf("Число: %d чётное: %s; кратно 3: %s; чётное и кратное 3: %s\n",
                        input,a, b, c);







    }

}


