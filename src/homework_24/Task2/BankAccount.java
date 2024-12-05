package homework_24.Task2;

public class BankAccount implements PaymentSystem {
    private double balance;
    private String name;


    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;

}


    @Override
    public void withdrawMoney(double amount) {
        if (balance < amount){
            System.out.println("На счету " + name + " не достаточно денег " + amount + " Евро");
        }else {
            balance -= amount;
            System.out.println("Со счета " + name + " снято " + amount + " Евро");

        }
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("На счет " + name + " поступило " + amount + " Евро");
    }
    @Override
    public double checkBalance() {
        return balance;

    }
    @Override
    public void transferMoney(String name, PaymentSystem recipient, double amount) {
        if (balance < amount) {
            System.out.println("На счету" + name + " не достаточно денег " + amount + " Евро");
        }else {
            withdrawMoney(amount);
            recipient.depositTransfer(amount);

        System.out.println("На счет " + name + " поступило " + amount + " Евро");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

        }