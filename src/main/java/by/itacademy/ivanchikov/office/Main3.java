package by.itacademy.ivanchikov.office;

public class Main3 {
    public static void main(String[] args) {
        String name = Util.generetName();
        String position = Util.generetPosichion();
        String age =Util.generetAge();
        System.out.println(name+"   "+ position);
       // Worker worker1=new Worker(name,age, faker.random().nextInt(10));
       // Worker worker2=new Worker(Util.generetName(),Util.generetAge(), faker.random().nextInt(10));
    }
}
