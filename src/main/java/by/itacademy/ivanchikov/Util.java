package byITAcademy_Ivanchikov;

public class Util {
    public static int calculateMax(int a, int b) {

        int c;
        if (a > b) ;
        {
            c = a;
        } else{
            c = b;
        }
        return c;
    }
    public static int calculateMin(int a, int b) {
        int min;
        if (a < b) ;
        {
            min = a;
        }else{
            min = b;
            return min;

        }

    }
    public static int calculateMax1(int a, int b, int x) {
        int max1;
        if (a < b && a < x) ;
        {
            max1 = a;
        } else{
            max1 = b;
            return max1;
        }
    }

}