package homework_15;

public class Teacher {
    String name;
    String subjectOfTeaching;
    int workExperience;

    public void info (){
        System.out.printf("Меня зовут %s, я преподаю %s, мой стаж работы %d лет \n", name, subjectOfTeaching, workExperience);
    }
    public Teacher (){
    }
    public Teacher (String name, String lesson, int yearOflesson){
        this.name = name;
        this.subjectOfTeaching = lesson;
        this.workExperience = yearOflesson;
    }

    public void teaches () {
        System.out.println("Я преподаю!");
    }
    public void checksHomework(){
        System.out.println("Я проверяю домашнее задание!");
    }
    public void improvesHimself(){
        System.out.println("Я самосовершенствуюсь!");
    }
    public void strategy(){
        System.out.println("Я ищу новые стратегии!");
    }
    public static void main(String[] args) {

      Teacher teacher1 = new Teacher("Денис Александрович", "математику", 5);
       teacher1.info();
       teacher1.teaches();
       teacher1.checksHomework();
       teacher1.improvesHimself();
       teacher1.strategy();



    }
}
