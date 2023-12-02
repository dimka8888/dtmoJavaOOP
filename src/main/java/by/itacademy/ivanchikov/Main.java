package byITAcademy_Ivanchikov;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];
        for (int i = 0; i < 10; i++) {
            users[i] = new User();
            users[i].setAge(i);
            users[i].setPassword("" + Math.random() * 10);
            users[i].setName("" + (char) (Math.random() * 1000) + (char) (Math.random() * 1000) + (char) (Math.random() * 1000));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Mame " + users[i].getName() + "\tPassword " + users[i].getPassword() + "\tAge " + users[i].getAge());
        }

    }
}
