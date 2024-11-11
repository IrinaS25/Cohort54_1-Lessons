package homework_17;
/*
Task 0
Написать класс Employee (Работник)
У него должны быть поля имя, возраст, зарплата
Инкапсулировать класс.
Написать метод info() выводящий информацию о работнике.
 */

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public void setName(String name) {
   if (name == null || name.isEmpty()){
       System.out.println("Вы ввели не коректное значение имени!");
       return;
   }
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 18 && age < 75){

        this.age = age;
    }
    }
    public void setSalary(double salary) {
        if (salary >= 1.500 && salary <= 25000) {

            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public void info() {
        System.out.printf("Мое имя: %s, мой возраст: %d, моя зарплата: %.2f\n", name, age, salary);
    }



    }

