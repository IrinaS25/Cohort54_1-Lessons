package homework_07;


//Task 3 (Повышенной сложности, опционально)
//Программа предлагает пользователю ввести четырехзначное число.
//Ввод осуществляется только в формате строки (String).
//Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
//Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
//Примеры:
//
//Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
//Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.print((String) "Введите четырехзначное число: ");
       String number = scanner.nextLine();
   }
}




       // if (number.length() != 4) {
        // if (number < 1000 || number > 9999) {
           // System.out.println("Введите правельное четырехзначное число: " );
           // return;
      /*  }
                 // Извлечение цифр
/*
int firstDigits = number / 1000; // Первая цифра
int secondDigits = (number / 100) % 10; // Вторая цифра
int thirdDigits = (number / 10) % 10; // Третья цифра
int fourthDigits = number % 10; // Четвертая цифра

               // Суммы
        int sumFirst = firstDigits + secondDigits;
        int sumSecond = thirdDigits + fourthDigits;

              // Сравнение
        if (sumFirst == sumSecond) {
            System.out.println("Число счастливое: " + number);
        } else {
            System.out.println("Число НЕ является счастливым");


    }
    }
    }
            */


