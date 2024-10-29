package Consultation1;
/*
**Задача 2.**
Задать в программе три стороны треугольника.
Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше
суммы двух других.
Сообщить результат - существует или нет треугольник с заданными сторонами.

 */
public class Treangle {
    public static void main(String[] args) {
        double a = 11.7;
        double b = 0.0;
        double c = 11.9;
        double sum1 = a + b;
        double sum2 = a + c;
        double sum3 = b + c;
            if (a < sum3 && b < sum2 && c < sum3) {
                boolean res = true;
                System.out.println("Такой треугольник существует");
            }else {
               boolean res = false;
                System.out.println("Таких треугольников нет");
            }

        }


}// End Class
