package homework_22.Task3;

public class Triangle extends Figure {

    private double  baseLength;
    private double heightToBase;

    public Triangle(double baseLength, double heightToBase) {
        this.baseLength = baseLength;
        this.heightToBase = heightToBase;
    }

    @Override
    public void calculateArea() {
        double areaTriangle = 0.5 * baseLength * heightToBase;
        System.out.printf("Площадь треугольника равна %.2f\n", areaTriangle);
    }
}
