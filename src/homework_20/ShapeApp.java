package homework_20;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle1", 4.5, 3.2);
        rectangle.displayInfo("Rectangle1", "red");
        rectangle.calculateArea();

        Circle circle = new Circle("Circle1", 2.1);
        circle.displayInfo("Circle1", "blue");
        circle.calculateArea();
    }
}
