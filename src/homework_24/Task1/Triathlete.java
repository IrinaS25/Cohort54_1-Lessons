package homework_24.Task1;

public class Triathlete implements Swimmer, Runner{
    private  String name;
    private int id;

    public Triathlete(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void swim() {
        System.out.println("Я плыву");

    }
    @Override
    public void run() {
        System.out.println("Я бегу");

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Triathlete{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
