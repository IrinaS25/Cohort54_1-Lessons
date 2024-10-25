package Lesson_5;

public class StringExample {
    public static void main(String[] args) {
        String string = "Java";

        String string1 = new String("Hallo");

        System.out.println(string);
        System.out.println(string.length());

        System.out.println(string1);
        System.out.println(string.toUpperCase());

        String string2 = string.toUpperCase();
        System.out.println("string2: " +string2);
        System.out.println("string: " +string);

        string2 = string2.toLowerCase();
        System.out.println("string2: " + string2);

        System.out.println("++++++++++++++++++++++++++");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        String concatStr = str1 + str2 + str3 + "!!!";
        System.out.println(concatStr);

        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr.concat(str3);
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3);
        System.out.println(concatStr3);

        String concatStr4 = String.join("     ",str1, str3, "!!!!");
        System.out.println("concatStr4: " + concatStr4);

        System.out.println("++++++++++++++++++++++");

        int a = 1;
        int b = 2;
        String string3 = "Hello";
        System.out.println(string3 + a);
        System.out.println(a + b + " " + string3 + " = " + (a + b));

        System.out.println("+++++++++++++++++++\n");

        String digits = "0123456789";
        System.out.println(digits.length());
        String digits2 ="9876543210";

        char firstChar = digits.charAt(0);
        char firstChar2 = digits2.charAt(0);

        System.out.println(firstChar);
        System.out.println(firstChar2);

        int length = digits.length();
        char lastChar = digits.charAt(digits.length() -1);
        System.out.println("last from digits: " + lastChar);
        System.out.println(digits2.charAt(digits2.length() -1));

        System.out.println("+++++++++++++++++++++++++++");

        String subString = digits.substring(2);
        System.out.println("digits.substring(2): " + subString);
        System.out.println("digits: " + digits);
        subString= digits.substring(2, 7);
        System.out.println("digitsubstring(2, 7): " + subString);

        System.out.println("++++++++Replace++++++++++");

        String string4 = "OneTwoOneTwoThree";
        String replace = string4.replace("One", "Stop");
        System.out.println("replace: " + replace);
        replace = string4.replaceFirst("One", "Stop");
        System.out.println("replaceFirst: " + replace);















    }
}
