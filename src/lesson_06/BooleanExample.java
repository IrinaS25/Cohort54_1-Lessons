package lesson_06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        int x = 10;
        int y = 5;
        //сравнение на равенство "=="
        boolean b1 = (x == y);
        System.out.println(x + " == " + y + " -> " + b1);

        //сравнение на  не равенство "!="
        b1 = x!= y;
        System.out.println(x + " != " + y + " -> " + b1);

        y = 10;

        //больше ">"
        b1 = x > y;
        System.out.println(x + " > " + y + " -> " + b1);

        //больше ">" или равно ">="
        b1 = x >= y;
        System.out.println(x + " >= " + y + " -> " + b1);

        //менше "<"
        b1 = y < y;
        System.out.println(x + " < " + y + " -> " + b1);

        //менше или "<" равно " <="
        b1 = x <= y;
        System.out.println(x + " <= " + y + " -> " + b1);

        String str = "Java is the best the";
        boolean contains = str.contains("Java");
        System.out.println("str.contains (\"Java\"):"  + contains);

        //indexOf
        int index = str.indexOf("the");
        System.out.println("Индекс: " + index);

        contains = index != -1;
        System.out.println("contains: " + contains);

        //lastIndex=Of
        index = str.lastIndexOf("the");
        System.out.println(index);

        System.out.println("============= Логические операции =======");

        boolean b2 = !false; //
        System.out.println("!false: " + !false);

        b2 = !(4 != 5);
        System.out.println("!(4 != 5): " + b2);

        System.out.println("************************");

        //Логическое И "&"

        b2 = true & true; //true
        System.out.println("true & true: " + b2);

        b2 = (2 < 5) & (11== 10); //false
        System.out.println("(2 < 5) & (11== 10): " + b2);

        //wir brauchen Zahlen 0 bis 100
        int z = 50;
        boolean b3 = z > 0 & z < 100;


        //Логическое или "|" (es reicht nur eine true)
        boolean b4 = true | false;
        b4 = false | false;
        System.out.println("false | false: " + b4);
        System.out.println("true | false: " + (true | false));

        //Введите или чётное число или число которое делится на 5 без остатка

        //генерация случайного числа (псевдослучайного числа)
        Random random = new Random();
        int rand = random.nextInt(101); //(0...101-1)->(0..100)вклчительно
        System.out.println("Случайне число: " + rand);

        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber. " + isGoodNumber);

        //Логическое тскл. ИЛИ (XOR)
        boolean b5 = true ^ false;
        System.out.println("true ^false: + b5");
        b5 = false ^false;
        System.out.println("false ^ false: " + b5);
        System.out.println("true ^ true: " + (true ^ true));
        System.out.println("false ^ true: " + (false ^ true));

        //Логическое сокращённое И "&&"
        //Wenn beide sind true nur dann kommt true

        boolean b6 = false && true;
        System.out.println("false && true: " + b6);

        b6 =(2 > 5) && (11==11);

        int a = 10;
        int b = 0;

        boolean b7 = (b != 0) && (a / b > 0);
        System.out.println(b7);

        System.out.println("+++++++++++++++++++++");

        //Логическое сокращённое И "||"
        //Macht true wenn nur eine Teil ist gleich true

        boolean b8 = true || (a / b > 2);
        System.out.println("b8: " + b8);

        System.out.println("************************++");

        System.out.println(true ^ true & false);
        //
        //! -> & -> ^ -> | -> && -> ||

        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;
        System.out.println(aa | bb | cc < 100 & !aa ^qq == 5);














    }
}
