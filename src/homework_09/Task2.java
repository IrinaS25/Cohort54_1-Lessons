package homework_09;
/*
Task 2
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)


 */
public class Task2 {
    public static void main(String[] args) {
       int pow = 4;
       powTwo(pow);

    }

    public static void powTwo(int n) {

        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2;
        }
        System.out.println(result);
    }
}
