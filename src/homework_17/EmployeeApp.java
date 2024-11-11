package homework_17;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee peter = new Employee("Tom",45, 5766.00);
        peter.info();

        peter.setAge(74);
        peter.setName("Alex");
        peter.setSalary(6567);
        peter.info();
    }
}
