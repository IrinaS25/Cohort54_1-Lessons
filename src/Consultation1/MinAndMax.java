package Consultation1;

public class MinAndMax {
    public static void main(String[] args) {
int r = 5;
int c = 8;
int resultMax = max(r, c);
        System.out.println(resultMax);
        int resultMin = min(r, c);
        System.out.println(resultMin);
    }//End Main

    public static int max(int a, int b) {
        int max = a;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
    public static int min(int s, int e) {
        int min = s;
        if (s < e) {
            min = s;
        } else {
            min = e;
        }
        return min;
    }
}//End Class
