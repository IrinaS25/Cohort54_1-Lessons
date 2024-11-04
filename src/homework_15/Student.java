package homework_15;

public class Student {
    String name;
    String faculti;
    int idNumber;

    public void info(){
        System.out.printf("Я студент: %s, я учусь на: %s факультете, мой ID номер: %d\n", name, faculti, idNumber);
}
public void teaches() {
    System.out.println("Я учу!");
}
public void tackesExams(){
    System.out.println("Я сдаю экзамены!");
}
public void playsTruant(){
        System.out.println("Я прогуливаю!");
    }
    public Student() {

    }
    public Student (String name, String faculti, int idNumber){
        this.name = name;
       this.faculti = faculti;
      this.idNumber = idNumber;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Саша", "медицинском", 13423534);
        student1.teaches();
        student1.playsTruant();
        student1.tackesExams();
        student1.info();
}
}






