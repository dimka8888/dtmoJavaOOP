package by.itacademy.ivanchikov.mycolection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Integer>listOfNumbers =new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(-1);
        listOfNumbers.add(3);
        listOfNumbers.add(5);
        listOfNumbers.add(1);
        System.out.println(listOfNumbers);

        Set<Integer>setOfNambers=new HashSet<>();
      setOfNambers.addAll(listOfNumbers);
        System.out.println(setOfNambers);

        Set<Integer>LinkedHeshSetOfNambers=new LinkedHashSet<>();
        listOfNumbers.add(1);
        listOfNumbers.add(-1);
        listOfNumbers.add(3);
        listOfNumbers.add(5);
        listOfNumbers.add(1);
        System.out.println(listOfNumbers);

        Set<Integer>treeSetOfNumbers=new TreeSet<>();
        treeSetOfNumbers.add(1);
        treeSetOfNumbers.add(-1);
        treeSetOfNumbers.add(3);
        treeSetOfNumbers.add(5);
        treeSetOfNumbers.add(1);
        System.out.println(treeSetOfNumbers);
    }
}