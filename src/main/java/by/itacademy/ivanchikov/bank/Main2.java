package by.itacademy.ivanchikov.bank;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        String number1 = "88";
        String number2 = "12";
        String number3 = "33";

        numbers.add(Integer.valueOf(number1));
        numbers.add(Integer.valueOf(number2));
        numbers.add(Integer.valueOf(number3));

        System.out.println(numbers);

        numbers.remove(numbers);
        System.out.println(numbers);
    }
}
