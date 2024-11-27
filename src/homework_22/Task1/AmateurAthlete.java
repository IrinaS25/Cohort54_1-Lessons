package homework_22.Task1;

public class AmateurAthlete extends Human{

    @Override
    public void run() {

        System.out.println("Я бегу со скоростью 15 км/ч");
        rest();
    }

    @Override
    public void rest() {

        System.out.println("Я отдыхаю 10 минут.");
    }
}

