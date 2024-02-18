package by.itacademy.ivanchikov.office;

public class Main {
    private static Math faker;

    public static void main(String[] args) {
        Worker worker1 = new Worker("Ewa", "Manager");
        Worker worker2 = new Worker("Roma", "Manager");
        Worker worker3 = new Worker("Ewa", "Manager");
        System.out.println(worker3);

        worker3.setName("Roma");
        System.out.println(worker3);

        boolean isequals = worker2.equals(worker3);
        System.out.println(isequals);

        //isequals = worker2.equals(worker1);
        //System.out.println(isequals);
        //System.out.println(worker3.getName());

        worker3.setPosition("Director");
        System.out.println(worker3);
        System.out.println(worker2);
        isequals = worker2.equals(worker3);
        System.out.println(isequals);
    }
}
