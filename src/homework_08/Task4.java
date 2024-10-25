package homework_08;

/*
Task 4 *(Опционально)
Напишите программу, которая просит пользователя ввести слово "hello". Если пользователь вводит правильное слово,
программа благодарит его и завершает работу. Если вводится неправильное слово,
программа продолжает запрашивать ввод, пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова,
и выведите это количество на экран.

 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        int counter = 0;

    while (true) {
        System.out.println("Введите слово hello:");
        word = scanner.nextLine();
        counter++;
        if(word.equals("hello")) {
            System.out.println("Спасибо, Вы ввели правельное слово.");
            break; }
        else {
            System.out.println("Количество попыток: " +counter);            }
        }
    }

    }

