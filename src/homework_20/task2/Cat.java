package homework_20.task2;

public class Cat extends Pet {

    private int numberOfMiceCaught;

    public Cat(String type, String nickName, String coloring, int age, String saund, int numberOfMiceCaught) {
        super(type, nickName, coloring, age, saund);
        this.numberOfMiceCaught = numberOfMiceCaught;
    }

    public void catchingMice(){
        System.out.println("Я ловлю мышей");

    }


}
