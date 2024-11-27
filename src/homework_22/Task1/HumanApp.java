package homework_22.Task1;

public class HumanApp {
    public static void main(String[] args) {
        AmateurAthlete peter = new AmateurAthlete();
        System.out.println(peter + " Peter");
        peter.run();

        ProfessionalAthlete alex = new ProfessionalAthlete();
        System.out.println(peter + " Alex");
        alex.run();

        Human tim  = new Human();
        System.out.println(peter + " Tim");
        tim.run();

    }
}
