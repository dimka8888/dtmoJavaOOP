package by.itacademy.ivanchikov;

public class MyWork {
    public static void main(String[] args) {
        User user2=new User();
        user2.setName("Dmitry");
        Position position=new Position();
        position.setSalory(4000);
        position.setName("Разработчик");
        Worker worker=new Worker();
        worker.setPosition(position);
        worker.setUser(user2);
        String name= worker.getUser().getName();
        System.out.println(name);
        user2.setName("Masha");
        //name=worker.getUser().getName();
        System.out.println(name);
    }
}
