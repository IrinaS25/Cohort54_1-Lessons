package homework_22.Task3;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double areaCircle = Math.PI * radius * radius;
        System.out.printf("Площадь круга равна %.2f\n", areaCircle);
    }
}
