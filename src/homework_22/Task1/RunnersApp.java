package homework_22.Task1;

public class RunnersApp {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurRunner amateur = new AmateurRunner();

        human.run();
        System.out.println("==============");
        amateur.run();

        System.out.println("=============");
        ProfRunner prof = new ProfRunner();
        prof.run();

        ProfRunner prof2 = new ProfRunner(30, 3);
        prof2.run();


    }
}

