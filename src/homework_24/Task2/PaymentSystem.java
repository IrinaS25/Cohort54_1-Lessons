package homework_24.Task2;

public interface PaymentSystem {

    void withdrawMoney(double amount);
    void depositTransfer(double amount);
   double checkBalance();
   void transferMoney(String name, PaymentSystem recipient, double amount);


}


