package lesson_19;

public class ConstantDemo {

    public static final double PI = 3.141519;
    public static final int [] ints = new int[10];


    private final int x;

    public ConstantDemo(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
