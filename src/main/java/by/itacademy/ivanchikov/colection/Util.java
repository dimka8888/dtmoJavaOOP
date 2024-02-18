package by.itacademy.ivanchikov.colection;

import java.util.List;

public class Util {
    public static void printColection(List<Element> colection) {
        System.out.println(colection);
    }

    public static boolean isNameInCollection(String name, List<Element> colection) {
        for (Element element : colection) {
            if (element.getName() == "span") ;
            return true;
        }
        return false;
    }
}
