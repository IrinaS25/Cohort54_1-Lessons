package homework_23.Task1;

public class Triangle extends Shape{

    private double lenghtA;
    private double hightH;
    private double lenghtB;
    private double lenghtC;

    public Triangle(double lenghtA, double hightH, double lenghtB, double lenghtC) {
        this.lenghtA = lenghtA;
        this.hightH = hightH;
        this.lenghtB = lenghtB;
        this.lenghtC = lenghtC;

        if(!isValidSides()) {
            System.out.println("invalid sides");
            this.lenghtA = 3;
            this.lenghtB = 4;
            this.lenghtC = 5;

        }
    }

    private boolean isValidSides(){
        return  lenghtA < lenghtB + lenghtC && lenghtB < lenghtA + lenghtC && lenghtC < lenghtA + lenghtB;

    }

    @Override
    public double areaCalculate() {
        double areaT = 0.5 * lenghtA * hightH;
        System.out.printf("Площадь треугольника равна %.2f \n", areaT);
        return areaT;
    }

    @Override
    public double perimeterCalculation() {
        double perT = lenghtA + lenghtB + lenghtC;
        System.out.printf("Периметр треугольника равен %.2f \n", perT);
        return perT;

    }

    public double getLenghtA() {
        return lenghtA;
    }

    public void setLenghtA(double lenghtA) {
        this.lenghtA = lenghtA;
    }

    public double getHightH() {
        return hightH;
    }

    public void setHightH(double hightH) {
        this.hightH = hightH;
    }

    public double getLenghtB() {
        return lenghtB;
    }

    public void setLenghtB(double lenghtB) {
        this.lenghtB = lenghtB;
    }

    public double getLenghtC() {
        return lenghtC;
    }

    public void setLenghtC(double lenghtC) {
        this.lenghtC = lenghtC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "lenghtA=" + lenghtA +
                ", hightH=" + hightH +
                ", lenghtB=" + lenghtB +
                ", lenghtC=" + lenghtC +
                '}';
    }
}
