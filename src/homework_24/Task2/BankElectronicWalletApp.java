package homework_24.Task2;
/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.

Опционально
Добавить в интерфейс метод:

transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */

public class BankElectronicWalletApp {
    public static void main(String[] args) {
        PaymentSystem volksbank = new BankAccount(34.4, "Volksbank");
        PaymentSystem sparkasse = new BankAccount(5432.6, "Sparkasse");

        volksbank.withdrawMoney(2.1);
        volksbank.withdrawMoney(5.1);
        volksbank.depositTransfer(7.9);
        volksbank.checkBalance();

        System.out.println("\n===================\n");

        PaymentSystem n26 = new ElectronicWallet(26378.89, "US-Dollar", "N26");
        PaymentSystem payPal = new ElectronicWallet(5000.00, "US-Dollar", "PayPal");

        System.out.println(n26.toString());
        n26.depositTransfer(234.4);
        n26.withdrawMoney(6543.7);
        n26.depositTransfer(5328.9);
        n26.withdrawMoney(76987.9);
        System.out.println(n26.toString());

        System.out.println("\n===================\n");
       n26.transferMoney("PayPal",payPal,1);
        System.out.println("Balance N26: " + n26.checkBalance());
        System.out.println("Balance PayPal: " + payPal.checkBalance());

       System.out.println("\n===================\n");

       payPal.transferMoney("Sparkasse", sparkasse, 2);


    }
}
