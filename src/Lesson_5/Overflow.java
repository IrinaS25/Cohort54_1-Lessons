package Lesson_5;

public class Overflow {
    public static void main(String[] args) {

        byte b1 = 127;
        b1++;
        b1 +=5;

        System.out.println(b1);

        b1--;
        System.out.println(b1);
        System.out.println(b1);

        short s1 = 32760;
        s1 += 7;
        System.out.println("s1: " +s1);

        s1++;
        System.out.println(s1);


    }
}
