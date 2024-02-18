package by.itacademy.ivanchikov.classname;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        String name = myClass.getClass().getName();
        System.out.println(myClass);
        System.out.println(name);
    }

}
