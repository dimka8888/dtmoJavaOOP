package by.itacademy.ivanchikov;

public class User {
    private String name;
    private String password;
    private int age;
    private Adress adress;

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setPassword(String NewPassword) {
        password = NewPassword;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
