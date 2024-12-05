package homework_24.Task2;

public class ElectronicWallet implements PaymentSystem{
    private double accountBalance;
    private String currency;
    private  String name;

    public ElectronicWallet(double accountBalance, String currency, String name) {
        this.accountBalance = accountBalance;
        this.currency = currency;
        this.name = name;

}

    @Override
    public void withdrawMoney(double amount) {
        if (accountBalance < amount){
            System.out.println("На вашем электронном кошельке " + name + " не достаточно денег " + amount + " " + currency);
        }else {
            accountBalance -= amount;
            System.out.println("С вашего электронного кошелька " + name + " снято " + amount + " " + currency);
        }
    }

    @Override
    public void depositTransfer(double amount) {
        accountBalance += amount;
        System.out.println("На ваш электронный кошелек " + name + " поступило " + amount + " " + currency);

    }

    @Override
    public double checkBalance() {
        return accountBalance;
    }

    @Override
    public void transferMoney(String name, PaymentSystem recipient, double amount) {
        if (accountBalance < amount) {
            System.out.println("На вашем электронном кошельке " + name + " не достаточно денег " + amount + " " + currency);
        } else {
            withdrawMoney(amount);
            recipient.depositTransfer(amount);
            System.out.println("С вашего электронного кошелька " + name + " снято " + amount + " " + currency);
        }
    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                "accountBalance=" + accountBalance +
                ", currency='" + currency + '\'' +
                '}';
    }
}

