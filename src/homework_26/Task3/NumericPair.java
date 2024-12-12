package homework_26.Task3;

import homework_26.Task2.Print;

public class NumericPair <T extends Number, U extends Number>{
    private T num1;
    private U num2;

    public NumericPair(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){

        return num1.doubleValue() + num2.doubleValue();
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public U getNum2() {
        return num2;
    }

    public void setNum2(U num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "NumericPair: {" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
