package homework_09;

import java.util.Scanner;

/*
Task 0
Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */
public class Task0 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();

    namberLengh(line);

    } // Methods area

public static void namberLengh(String li) {

    int length = (int) li.length();

        System.out.println(length);

    }








} //End class



