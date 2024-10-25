package homework_08;
/*
Task 1
Найдите произведение всех чисел от 1 до 10 включительно.

Результат выведите на экран


 */
public class Task1 {
    public static void main(String[] args) {
        long prodact = 1;
        int x = 1;

        while (x <= 10) {
            prodact = prodact * x;
            x++;
        }
        System.out.println("Произведение всех чисел от 1 до 10 включительно: " + prodact);
    }
}
