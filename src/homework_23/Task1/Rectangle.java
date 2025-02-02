package homework_23.Task1;

public class Rectangle extends Shape{

    private double lenghtA;
    private double lenghtB;

    public Rectangle(double lenghtA, double lenghtB) {
        this.lenghtA = lenghtA;
        this.lenghtB = lenghtB;
    }

    @Override
    public double areaCalculate() {
        double areaR = lenghtA * lenghtB;
        System.out.printf("Площадь прямоугольника равна %.2f \n", areaR);
        return areaR;
    }

    @Override
    public double perimeterCalculation() {
        double perR = 2 * (lenghtA + lenghtB);
        System.out.printf("Периметр прямоугольника равен %.2f \n", perR);
        return perR;
    }

    public double getLenghtA() {
        return lenghtA;
    }

    public void setLenghtA(double lenghtA) {
        this.lenghtA = lenghtA;
    }

    public double getLenghtB() {
        return lenghtB;
    }

    public void setLenghtB(double lenghtB) {
        this.lenghtB = lenghtB;
    }
}

