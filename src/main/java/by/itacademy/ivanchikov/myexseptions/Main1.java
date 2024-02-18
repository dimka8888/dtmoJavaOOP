package by.itacademy.ivanchikov.myexseptions;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 0, 8, 9, 7, -2, -10,};
        System.out.println("Цикл начал свою работу");
        for (int element = 0; element <= numbers.length; element++) {
            try {
                System.out.println(1 / numbers[element]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Привет вам от исключений");
            } catch (ArithmeticException  e){
                System.out.println(e);
            }
        }
        System.out.println("Цикл закончил свою работу");
    }
}
