package homework_20;

public class Rectangle extends Shape{
    private double wight;
    private double height;

    public Rectangle(String name, double wight, double height) {
        super(name);
        this.wight = wight;
        this.height = height;

}
    public void setDemensions(double wight, double height){
       this.wight = wight;
       this.height = height;
       calculateArea();
    }

    public void calculateArea() {
        double calculateArea = wight * height;
        System.out.println("Площадь прямоугольника: " + wight + " * " + height + " = " + calculateArea);
    }

}
