package by.itacademy.ivanchikov.people;

import java.util.Arrays;

public class Human {

    String body;
    String head;
    String[]arms;

    @Override
    public String toString() {

        return "Human{" +
                "body='" + body + '\'' +
                ", head='" + head + '\'' +
                ", arms=" + Arrays.toString(arms) +
                '}';
    }
}