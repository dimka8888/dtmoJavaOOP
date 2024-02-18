package by.itacademy.ivanchikov.mystatic;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("alex", "B");
        Driver driver2 = new Driver("Dmitry", "C");
        Driver driver3 = new Driver("Vasy", "A");
        System.out.println(driver1);
       // driver1.setCar("acura");
        driver2.setCar("BMW");
       // driver3.setCar("Mazda");
        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);

    }
}
