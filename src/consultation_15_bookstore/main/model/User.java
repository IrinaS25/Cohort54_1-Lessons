package consultation_15_bookstore.main.model;

public class User {
    public static int counter = 1;
    private int id;
    private String Email;
    private String Password;
    private String NickName;
    private int age;

    public User(String email, String password, String nickName, int age) {
        this.id = counter++;
        this.Email = email;
        this.Password = password;
        this.NickName = nickName;
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User: {" +
                "id=" + id +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", NickName='" + NickName + '\'' +
                ", age=" + age +
                '}';
    }
}
