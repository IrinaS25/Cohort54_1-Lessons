package Homework_05;

//Task 2
//Создайте строки:
//"Java"
//"is"
//"a"
//"powerful"
//"language"
//Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
//Выведите на экран получившуюся строку и её длину.

public class Task2 {
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
        String space = " ";

        String concatStr = string1 + string2 + string3 + string4 + string5 + string6 + string7 + string8 + string9 + string10;
        System.out.println(concatStr);

        String concatStr1 = String.join("", string1, string2, string3, string4, string5, string6, string7, string8, string9, string10 + concatStr.length());
        System.out.println(concatStr1);


        
        }
        }