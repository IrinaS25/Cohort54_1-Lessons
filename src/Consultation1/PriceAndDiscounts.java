package Consultation1;
/*
**Задача 3.**
Сделайте расчет покупки товаров со скидками.
Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
Клиент взял N товаров A и M товаров B.
Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
Вычислите итоговую стоимость покупки и величину полученной скидки.
 */
public class PriceAndDiscounts {
    public static void main(String[] args) {

        double a = 12.5;
        double b = 15.99;
        double discounterA = 5;
        double discounterB = 10;

        int counterA = 5;
        int counterB = 7;
        double[] sumRes = sume(a, b, discounterA, discounterB, counterA, counterB);

        double totalCost = sumRes[0];
        double totalDiscount = sumRes[1];

        System.out.printf("Итоговая стоимость покупки: %.2f, евро\n", totalCost);
        System.out.printf("Величина полученной скидки: %.2f евро\n", totalDiscount);

    }
     public static double[] sume (double a, double b, double discA, double discB, int counterA, int counterB) {
         discA = discA / 100;
         discB = discB / 100;
         double sumA = (a * counterA);
         double sumB = (b * counterB);
         double discounterAB = (sumA * discA) + (sumB * discB);
         double sumAB = ((sumA - (sumA * discA)) + (sumB - (sumB * discB)));


         if (sumAB > 100) {
             double discountAll = sumAB * 0.05;
             sumAB = sumAB - discountAll;
             discounterAB = discounterAB + discountAll;
         }

         return new double[]{sumAB, discounterAB};
         }


     }