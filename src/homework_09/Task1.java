package homework_09;

/*
Task 1
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Copy
Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном
порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Copy
Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке
Если флаг == false -> печатает массив в прямом порядке

 */
public class Task1 {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 4, 3, 6, 7};

        reverseSequenceOfArray(numbers);

        printArrayWithIndex(numbers, 2);

        printArrayWithFlag(numbers, true);
        printArrayWithFlag(numbers, false);
    }

    public static void reverseSequenceOfArray(int[] array) {
        int i = array.length - 1;

        while (i >= 0) {
            System.out.print(array[i] + (i < array.length ? ", " : " "));
            i--;

        }
    }
public static void printArrayWithIndex(int[] array, int index) {
            int i = 0;
            while (i < index && i < array.length)
            {
                System.out.print(array[i] + (i < array.length -1 ? ", " : " "));
                i++;
        }
       i = Math.min(index, array.length -1);
            while (i >= 0) {
                System.out.print(array[i] + (i < array.length -1 ? ", " : " "));
                i--;
            }
            }
            public static void printArrayWithFlag(int[] array, boolean reserve) {
        if (reserve) {
            int i = array.length -1;
            while (i >= 0) {
                System.out.print(array[i] + (i < array.length -1 ? ", " : " "));
                i--;
            }
            }else {
            int i = 0;
            while (i < array.length) {
                System.out.print(array[i] + (i < array.length -1 ? ", " : " "));
                i++;
            }

        }


    }
}//End class
