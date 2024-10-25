package homework_06;

//Task 2
//Создайте две переменные типа int.
//
//В первую переменную запишите случайное значение от 0 до 50.
//Во вторую переменную случайное значение от 0 до 100.
//(опционально) Во вторую переменную случайное значение от -20 до 30.
//Проверьте:
//
//равны ли переменные,
//не равны ли они,
//больше ли a, чем b,
//и меньше ли b, чем a.
//Выведите результат на экран.


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int rand1 = random.nextInt(51);
        int rand2 = random.nextInt(101);
        rand2 = random.nextInt(51) - 20;
        System.out.println(rand1);
        System.out.println(rand2);


        boolean a = rand1 == rand2;
        System.out.println(a);

        boolean b = rand1 != rand2;
        System.out.println(b);

        boolean c = rand1 > rand2;
        System.out.println(c);

        boolean d = rand2 < rand1;
        System.out.println(d);




    }
}
