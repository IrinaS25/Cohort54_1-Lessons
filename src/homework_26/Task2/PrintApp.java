package homework_26.Task2;

import lists.MyArrayList;
/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра
типа MyArrayList и MyArrayList, и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
 */
public class PrintApp {
    public static void main(String[] args) {
        MyArrayList<String> name = new MyArrayList<>();
        name.add("Alice");
        name.add("Bob");

        MyArrayList<Integer>scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        Print.printTwoLists(name, scores);


    }
}
