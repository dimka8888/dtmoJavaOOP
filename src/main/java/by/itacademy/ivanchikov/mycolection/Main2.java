package by.itacademy.ivanchikov.mycolection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> linkedListOfNumbers = new ArrayList<>();
        linkedListOfNumbers.add(1);
        linkedListOfNumbers.add(-3);
        linkedListOfNumbers.add(7);
        linkedListOfNumbers.add(4);
        linkedListOfNumbers.add(2);
        System.out.println(linkedListOfNumbers);

        linkedListOfNumbers = new LinkedList<>();
        linkedListOfNumbers.add(1);
        linkedListOfNumbers.add(-3);
        linkedListOfNumbers.add(7);
        linkedListOfNumbers.add(4);
        linkedListOfNumbers.add(2);
        System.out.println(linkedListOfNumbers);
    }
}
