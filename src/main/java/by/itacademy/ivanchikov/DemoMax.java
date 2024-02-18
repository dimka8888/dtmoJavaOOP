package by.itacademy.ivanchikov;

public class DemoMax {
    public static void main(String[] args) {

        int c = Util.calculateMax(3, 9);
        System.out.println("Мaксимальное число  =  " + c);

        int min = Util.calculateMin(3, 9);
        System.out.println("Минимальное число =" + min);

        int max1 = Util.calculateMax1(3, 9, 12);
        System.out.println("Максимальное число = " + max1);

        int max2 = Util.calculateMax4(3, 4, 7, 8);
        System.out.println("Max=" + max2);
    }
}
