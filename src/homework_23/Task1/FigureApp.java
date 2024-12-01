package homework_23.Task1;

public class FigureApp {
        public static void main(String[] args) {

                Shape[] shapes = new Shape[]{new Circle(5), new Rectangle(3, 6), new Triangle(1.1, 2.2, 3.3, 4.4)};

                double totalArea = 0;
                double totalPerimeter = 0;

                for (int i = 0; i < shapes.length; i++) {

                        totalArea += shapes[i].areaCalculate();

                        totalPerimeter += shapes[i].perimeterCalculation();

                }
                        System.out.println("\n=====================");
                        System.out.printf("Общая площадь фигур: %.2f \n", totalArea);
                        System.out.printf("Общий периметр фигур: %.2f \n", totalPerimeter);


                }
        }

