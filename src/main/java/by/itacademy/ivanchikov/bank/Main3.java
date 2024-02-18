package by.itacademy.ivanchikov.bank;

public class Main3 {
    public static void main(String[] args) {
        Account account1=new Account("d","1");
        Account account2=new Account("d","1");

        String str1="5";
        String str2="5";
        System.out.println(account1.equals(account2));
    }
}
