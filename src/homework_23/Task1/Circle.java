package homework_23.Task1;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double areaCalculate() {
        double areaC = Math.PI * radius * radius;
        System.out.printf("Площадь круга равна %.2f \n", areaC);
        return areaC;
    }

    @Override
    public double perimeterCalculation() {
        double perC = 2 * Math.PI * radius;
        System.out.printf("Периметр круга равен %.2f \n", perC);
        return perC;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


