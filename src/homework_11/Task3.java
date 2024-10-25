package homework_11;
/*
Task 3 * (Опционально)
Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов).
 */

public class Task3 {
    public static void main(String[] args) {
        int [] digits = {1, 4, 0, 5, 0, 4, 1};
       //boolean result = palindrome(digits);
      System.out.println(palindrome(digits));
   }

    public static boolean palindrome (int[] numbers) {

        int left = 0;
        int right = numbers.length -1;
        while (left < right) {
            if (numbers[left] != numbers[right]) return false;

            left++;
            right--;
        }
        return true;
    }

}
