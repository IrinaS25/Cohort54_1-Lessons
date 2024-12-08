package homework_24.Option;

public interface PaymentSystem {

    boolean transferMoney(double amount, PaymentSystem recipient);

    boolean withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();

    String getCurrency();
    String getTitle();
}
