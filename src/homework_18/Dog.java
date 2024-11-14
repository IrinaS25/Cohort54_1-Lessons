package homework_18;
/*
Task 2 * (Опционально)
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка.
Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии, нужно проверить
помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер
 */

public class Dog {
    private String name;
    private int jumpHeigh;
    private int counter;


    public Dog(String name, int jumpHeigh) {
        this.name = name;
        this.jumpHeigh = jumpHeigh;

    }
    public void info(){
        System.out.println("Я собака " + name + ", я умею прыгать на высоту:" + jumpHeigh);
    }

    public static void jump (){
        System.out.println("Я прыгаю");
    }
public void training(){
    System.out.println("Я Тренеруюсь");
int firstJamp = jumpHeigh;
int maxJamp = firstJamp * 2;
    while (counter < 10 || maxJamp < firstJamp * 2){

        System.out.println("Моя высота прыжка: " + jumpHeigh);
        System.out.println("Я не способна прыгнуть на такую высоту");

}
    }
}

