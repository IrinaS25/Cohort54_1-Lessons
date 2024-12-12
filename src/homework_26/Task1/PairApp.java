package homework_26.Task1;

/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.

Требования:

Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.

 */
public class PairApp {
    public static void main(String[] args) {
        Pair<String>pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

       pair.setFirst("Java");
        System.out.println(pair.getFirst());

        pair.setSecond("Pyton");
        System.out.println(pair.getSecond());

        pair.swap();
        System.out.println(pair);
    }
}
