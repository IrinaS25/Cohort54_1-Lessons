package lesson_19;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "Java" + " is" + " " + "the" + " " + "best";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("Hallo");

        sb1.append(" ");
        sb1.append("World").append("!");

        String string = sb1.toString();
        System.out.println(string);

        sb = new StringBuilder("Hello World");

        sb.insert(6, "beautiful");
        System.out.println(sb.toString());

/*
        String s = "Hello World";
        String s1 = s.substring(0, 6);
        String s2 = s.substring(6);
        String res = s1 + "beautiful" + s2;
        System.out.println(res);
       */


sb = new StringBuilder("Hello World!");
sb.replace(6, 11, "Java");
        System.out.println(sb.toString());

        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());

        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        System.out.println(sb.length());

        char ch = sb.charAt(3);
        System.out.println(ch);

        sb = new StringBuilder("Hello World!");
        String subString = sb.substring(1);
        System.out.println(subString);

        subString = sb.substring(6, 9);
        System.out.println(subString);

        sb = new StringBuilder("Hello");
        System.out.println(sb.length());

        sb.setLength(10);
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println((int) ch1);

        sb.setLength(3);
        System.out.println(sb.toString());

        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);

        String[] strings = example.split(" ");
        System.out.println(Arrays.toString(strings));


    }

    private static String PharseString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите несколько слов");

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        String result = "";







    }
}
