package homework_22.Task3;

public class Square extends Figure {
    private double side;


    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double areaSquare = side * side;
        System.out.printf("Площадь квадрата равна %.2f\n", areaSquare);
    }
}
