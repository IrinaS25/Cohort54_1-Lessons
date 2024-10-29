package Consultation1;
/*
**Задача 1.**
Написать метод, возвращающий минимальное из трех целых чисел.
Числа задаются в программе.
 */
public class Min {
    public static void main(String[] args) {
       int s = 4;
       int t = 10;
       int g = 1;
       int res = min(s, t, g);
        System.out.println(res);


    }//End main
    public static int min (int a, int b, int c){
        int min = a;
        if(b < min){
            min = b;
    } else if (c < min) {
            min = c;
        }else {

        }
            return min;
        }


    }//End Class

