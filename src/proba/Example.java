package proba;

public class Example {
    public static boolean StringE(String str) {
            if (str.length() < 4) {
                return false;
            }
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') counter++ ;
        }

                return (counter >= 1 && counter <= 3);

            }


    public static void main(String[] args) {
        String str = "Heelle";
        System.out.println(StringE(str));

    }


}
