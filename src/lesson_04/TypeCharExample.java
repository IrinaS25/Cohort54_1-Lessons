package lesson_04;

public class TypeCharExample {
    public static void main(String[] args) {

        char a = 'A';
        char a1 = 65;
        char a2 = 0x41;
        a2 = 0x0041;
        char a3 = '\u0041';
        char x = '\u1507';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1); //10 format
        System.out.println("a2: " + a2); // 16 format
        System.out.println("x: " + x);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);

        digit0 = (char) (digit0 + 5);
        System.out.println("digit0: " + digit0);

        char letter = 97;


    }
}
