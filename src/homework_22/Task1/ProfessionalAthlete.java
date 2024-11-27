package homework_22.Task1;

public class ProfessionalAthlete extends Human {

    @Override
    public void run() {
        System.out.println("Я бегу со скоростью 25 км/ч");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("Я отдыхаю 5 минут.");
    }
}

