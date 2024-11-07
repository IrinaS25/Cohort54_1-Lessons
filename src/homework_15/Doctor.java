package homework_15;

public class Doctor {
    String name;
    String speciality;
    int yearOfExperience;

    public void info(){
        System.out.printf("Меня зовут %s, моя специальность %s, мой опыт работы составляет %d лет \n", name, speciality, yearOfExperience);
    }
    public void treat(){
        System.out.println("Я лечу!");
    }
    public void getDiagnostics(){
        System.out.println("Я диагностирую!");
    }
    public void getConsulting(){
        System.out.println("Я консультирую!");
    }
    public Doctor (){

    }
    public Doctor (String name, String speciality, int yearOfExperience){
        this.name = name;
        this.speciality = speciality;
        this.yearOfExperience = yearOfExperience;
    }
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor ("Сергей Петрович", "Окулист", 13);
        doctor1.info();
        doctor1.treat();
        doctor1.getConsulting();
    doctor1.getDiagnostics();
    }


}
