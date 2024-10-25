package homework_04;

public class Task1 {
    public static void main(String[] args) {
        /*Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
Ожидаемый результат:

Значение myDouble: 10.0
*/
        int intTrees =10;
        double myDouble = intTrees;
        System.out.println("myDouble: " + myDouble);

    }
}
