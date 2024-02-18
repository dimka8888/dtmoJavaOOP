package by.itacademy.ivanchikov.office;

public class Util {
    public static String generetName() {
        String name;
        name = "Vasy";
        return name;
    }
    public static String generetPosichion(){
        String posichion;
        posichion="Maneger";
        return posichion;
    }
    public static String generetAge(){
        int age;
        age=((int) Math.random()*100);
        return String.valueOf(age);
    }
}
