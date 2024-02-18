package by.itacademy.ivanchikov.colection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main12 {
    public static void main(String[] args) {
        Element element1 = new Element("span");
        Element element2 = new Element("button");
        Element element3 = new Element("button");
        List<Element> elements = new ArrayList<>();
        elements.add(element1);
        elements.add(element2);
        elements.add(element3);
       /* Util.printColection(elements);
        for (Element element : elements) {
            if (element.getName() == "span")
                System.out.println(element.getName());
        }*/
        boolean isNameInCollection = Util.isNameInCollection("не работает(((", elements);
        System.out.println(isNameInCollection);
        List<Element>LinkedList=new LinkedList<>();
        LinkedList.add(element1);
        LinkedList.add(element2);
        LinkedList.add(element3);
        Util.printColection(LinkedList);
    }
}
