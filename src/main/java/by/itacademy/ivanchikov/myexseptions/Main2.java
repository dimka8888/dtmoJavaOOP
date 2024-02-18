package by.itacademy.ivanchikov.myexseptions;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        User user1 = new User("saha", "123");
        User user2 = new User("dima", "1234");
        User user3 = new User("pety", "12345");
        ArrayList<User> users = new ArrayList<User>();
        int size = users.size();
        System.out.println(size);
        users.add(user1);
        System.out.println(users.size());
        users.add(user2);
        users.add(user3);
        System.out.println(users.size());
        try {
            System.out.println(users.getFirst());
        } catch (Exception e) {

        }
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
}