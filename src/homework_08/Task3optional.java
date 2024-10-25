package homework_08;
/*
Task 3.1 * (Опционально)
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
 */

public class Task3optional {
    public static void main(String[] args) {

        int x = 1;
        int count = 0;
        while (x <= 100 && count < 7) {
            if (x % 5 == 0) {
            System.out.print(x + ", ");
            count++;
            }
            x++;

        }

        }

    }

