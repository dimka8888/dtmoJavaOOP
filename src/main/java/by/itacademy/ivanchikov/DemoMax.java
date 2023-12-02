package byITAcademy_Ivanchikov;

public class DemoMax {
    public static void main(String[] args) {

        int c = Util.calculateMax(3, 9);
        System.out.println("Мaксимальное число  =  " + c);

        int min = Util.calculateMin(3, 9);
        System.out.println("Минимальное число =" + min);

        int max1=Util.calculateMax1(3,9,12);
        System.out.println("Максимальное число = "+ max1);
    }
}
