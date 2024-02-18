package by.itacademy.ivanchikov.bankomat;

import java.util.Objects;

public class CardPrior implements HowPrintBalance {
    private String orderNumer;
    private double balance;
    private String cardNumer;

    public CardPrior(String orderNumer, double balance, String cardNumer) {
        this.orderNumer = orderNumer;
        this.balance = balance;
        this.cardNumer = cardNumer;
    }

    public String getOrderNumer() {
        return orderNumer;
    }

    public void setOrderNumer(String orderNumer) {
        this.orderNumer = orderNumer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardNumer() {
        return cardNumer;
    }

    public void setCardNumer(String cardNumer) {
        this.cardNumer = cardNumer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardPrior cardPrior = (CardPrior) o;
        return Double.compare(balance, cardPrior.balance) == 0 && Objects.equals(orderNumer, cardPrior.orderNumer) && Objects.equals(cardNumer, cardPrior.cardNumer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumer, balance, cardNumer);
    }

    @Override
    public String toString() {
        return "CardPrior{" +
                "orderNumer='" + orderNumer + '\'' +
                ", balance=" + balance +
                ", cardNumer='" + cardNumer + '\'' +
                '}';
    }

    @Override
    public int getCardBalance() {
        return (int) (100 * getBalance());
    }
}
