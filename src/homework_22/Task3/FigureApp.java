package homework_22.Task3;

public class FigureApp {
    public static void main(String[] args) {
        Circle circle = new Circle(2.1);
        circle.calculateArea();

        Square square = new Square(4.3);
        square.calculateArea();

        Triangle triangle = new Triangle(4.1, 5.2);
        triangle.calculateArea();

    }
}
