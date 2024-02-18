package by.itacademy.ivanchikov.bank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Ivan", "123456");
        Account account2 = new Account("Dima", "1111111");

        System.out.println(account1);
        System.out.println(account2);
        Account account3 = new Account("saha", "33233444334");
        Account account4 = new Account("Pety", "22");
        Account account5 = new Account("Vasy", "11");

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);
        System.out.println(accounts);

        Account account6 = new Account("Vasy", "11");
        accounts.remove(new Account("Vasy", "11"));
        System.out.println(accounts);
    }
}
