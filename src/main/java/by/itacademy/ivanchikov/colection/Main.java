package by.itacademy.ivanchikov.colection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Element element1 = new Element("dif");
        Element element2 = new Element("input");

        List<Element> elements = new ArrayList<>();
        elements.add(element1);
        elements.add(element2);
        System.out.println(elements);

        Util.printColection(elements);
        List<Element> elements2 = new LinkedList<>();
        elements2.add(element1);
        elements2.add(element2);
        Util.printColection(elements2);


    }
}
