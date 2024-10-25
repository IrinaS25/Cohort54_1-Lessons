package Homework_05;

//Task 3* (Опционально)
//Попросите пользователя ввести строку чётной длины с клавиатуры.
//Распечатайте два средних символа строки.
//Например:
//
//Для строки "string" результат будет "ri".
//Для строки "code" результат будет "od".
//Для строки "Practice" результат будет "ct".


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("tötnaja dlina");
        String input = scanner.nextLine();

        int index = input.length() / 2 - 1;

        //Opt1
        System.out.println("" + input.charAt(index) + input.charAt(index + 1));

        //Opt2
        String substring = input.substring(index, index + 2);
        System.out.println(substring);



        String a = "string";
        String subString = a.substring(2, 4);
        subString = a.substring(2 ,4);
        System.out.println("string 2, 4: " + subString);


        String b = "code";
        String subString1 = b.substring(1, 3);
        subString1 = b.substring(1 ,3);
        System.out.println("code 1, 3: " + subString1);

        String c = "Ptactice";
        String subString2 = c.substring(3, 5);
        subString2 = c.substring(3 ,5);
        System.out.println("Practice 3, 5: " + subString2);




    }
}
