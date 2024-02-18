package by.itacademy.ivanchikov.bank;

import java.util.Objects;

public class Account {
    private String name;
    private String accountNumber;
    private int accountSum;

    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountSum = 0;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountSum() {
        return accountSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountSum(int accountSum) {
        this.accountSum = accountSum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountSum=" + accountSum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountSum == account.accountSum && Objects.equals(name, account.name) && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountNumber, accountSum);
    }
}
