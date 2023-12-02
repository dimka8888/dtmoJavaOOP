package byITAcademy_Ivanchikov;

public class Main1 {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setName("Vasy");
        user2.setName("dava");
        user3.setName("Pety");
        User[] users = new User[3];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        for (int i=0;i<3;i++){
            System.out.println(users[i].getName());
        }

    }
}
