package homework_26.Task3;
/*

 */

public class NumericPairApp {
    public static void main(String[] args) {
        NumericPair<Integer, Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair);
        System.out.println(intPair.sum());

        NumericPair<Double, Double> doublePair = new NumericPair<>(3.1, 4.3);
        System.out.println(doublePair);
        System.out.println(doublePair.sum());
        doublePair.getNum1();
        doublePair.setNum1(4.4);
        System.out.println(doublePair.sum());



    }
}
