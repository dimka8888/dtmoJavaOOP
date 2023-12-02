package byITAcademy_Ivanchikov;

public class MyCity {
    public static void main(String[] args) {
        Adress adress1 = new Adress();
        adress1.setStreet("Prohladnay");
        adress1.setCity("Gomel");
        adress1.setHouse("2");
        adress1.setFlat(2);
        User user1 = new User();
        user1.setName("Dmitry");
        user1.setAdress(adress1);
        Adress adress2 = user1.getAdress();
        String city = adress2.getCity();
        System.out.println(city);
        adress1.setCity("Minsk");
        city = user1.getAdress().getCity();
        System.out.println(city);
    }
}
