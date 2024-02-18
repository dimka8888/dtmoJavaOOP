package by.itacademy.ivanchikov.office;

import com.github.javafaker.Faker;

public class Main2 {
    public static void main(String[] args) {
        String name;
        String posichion;
        name = Util.generetName();
        posichion = Util.generetPosichion();
        System.out.println(name);
        System.out.println(posichion);
        Worker worker1 = new Worker(name, posichion);
        System.out.println(worker1);
        Faker faker=new Faker();
        Worker worker2 = new Worker(faker.name().firstName(),faker.job().position(),faker.random().nextInt(10));
        System.out.println(worker2);
        faker = new Faker();
        for (int i=0;i<10;i++){
            name=faker.name().firstName();
            System.out.println(name);
        }
    }
}
