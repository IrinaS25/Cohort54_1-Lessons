package Homework_05;

//Task 2.2 * (Опционально)
//Замените в результирующей строке слово "powerful" на "super".
//Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
//Выведите на экран значение этой переменной.

public class Task2optional {
    public static void main(String[] args) {

        String string1 = "\"Java";
        String string2 = " ";
        String string3 = "is";
        String string4 = " ";
        String string5 = "a";
        String string6 = " ";
        String string7 = "powerful";
        String string8 = " ";
        String string9 = "language";
        String string10 = ".\"";

        String concatStr = string1 + string2 + string3 + string4 + string5 + string6 + string7.replace("powerful","super") + string8 + string9 + string10;
        System.out.println(concatStr);

        String concatStr1 = String.join("", string1, string2, string3, string4, string5, string6, string7.replace("powerful", "super"), string8, string9, string10);
        System.out.println(concatStr1);


        boolean a = (concatStr1 == "age");
        System.out.println(a);

        String str = "Java is the powerful language";
        boolean contains = str.contains("age");
        System.out.println("str.contains (\"age\"):"  + contains);






    }
}


