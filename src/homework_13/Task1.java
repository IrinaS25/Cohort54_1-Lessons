package homework_13;
/*
Сортировка массива
 */


import java.sql.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 23, 77, 2, 9, 0, 14};
        sortSelection(numbers);
        System.out.println(Arrays.toString(numbers));


        }
    public static int minIndex (int []array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int minIndex (int []array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;

    }

    public static void sortSelection (int[]array){
        for (int i = 0; i < array.length; i++) {
            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
        }
        }






