package homework_20.task2;
/*
Task 2
Придумать и написать как минимум одну иерархию классов в которой будет
один родительский клас и два наследника, расширяющих его функционал

У родительского класса должен быть метод создающий строку с информацией
об объекте (метод String toString())
 */

public class Pet {
    private String type;
    private String nickName;
    private String coloring;
    private int age;
    private String saund;

    public Pet(String type, String nickName, String coloring, int age, String saund) {
        this.type = type;
        this.nickName = nickName;
        this.coloring = coloring;
        this.age = age;
        this.saund = saund;

}
    public void speak(){
        System.out.println(type + " " + "Издает звук: " + saund);
    }
    public String toString (){
        return type + ": " + "Nick Name: " + nickName + ", " + "coloring: " + coloring + ", " + "age: " + age ;
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public java.lang.String getName() {
        return nickName;
    }

    public void setName(java.lang.String name) {
        this.nickName = name;
    }

    public java.lang.String getColor() {
        return coloring;
    }

    public void setColor(java.lang.String color) {
        this.coloring = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSaund() {
        return saund;
    }

    public void setSaund(String saund) {
        this.saund = saund;
    }
}
