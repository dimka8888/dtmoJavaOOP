package by.itacademy.ivanchikov.people;

public class Main {
    public static void main(String[] args) {
        Human human=new Human();
        human.body="norm";
        human.head="black";
        human.arms= new String[]{"right", "left"};
        System.out.println(human);

        Female female=new Female();
        female.body="norm";
        female.head="good";
        female.arms=new String[]{"r","l"};
        System.out.println(female);

        GrandMun grandMun=new GrandMun();
        grandMun.body="norm";
        grandMun.arms=new String[]{"r"};
        System.out.println(grandMun);
    }
}
