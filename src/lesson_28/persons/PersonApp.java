package lesson_28.persons;
/*
Task 2
Написать в классе Person метод для проверки валидности Password
 */


public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person(" ", "asssSSS1$");

        person.setEmail("valid@email.com");
        System.out.println(person);
    }
}