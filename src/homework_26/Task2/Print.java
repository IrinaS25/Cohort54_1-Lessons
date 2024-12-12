package homework_26.Task2;

import lists.MyArrayList;

public class Print <T, U>{

    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2){

        StringBuilder sb = new StringBuilder("// Вывод: // ");
        for (int i = 0; i < list1.size(); i++) {
        sb.append(list1.get(i));
        sb.append(i < list1.size() - 1 ? " // " : " // ");

        }

            for (int i = 0; i < list2.size(); i++){
                sb.append(list2.get(i));
        sb.append(i < list2.size() - 1 ? " // " : "");

        }
        System.out.println(sb);
    }
}
