package lesson_19;

public class LessonApp {
    public static void main(String[] args) {
        ConstantDemo demo = new ConstantDemo(10);
        System.out.println(demo.getX());

        ConstantDemo demo2 = new ConstantDemo(20);
        System.out.println(demo2.getX());

        String text = "Hello World";
        String text1 = text.toUpperCase();
        System.out.println(text);
        System.out.println(text1);



    }
}
