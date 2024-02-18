package by.itacademy.ivanchikov.bankomat;

import java.util.Objects;

public class CardBB implements HowPrintBalance{
    private String nameOfOwner;
    private int sumOfMany;

    public CardBB(String nameOfOwner, int sumOfMany) {
        this.nameOfOwner = nameOfOwner;
        this.sumOfMany = sumOfMany;
    }

    public int getSumOfMany() {
        return sumOfMany;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    @Override
    public String toString() {
        return "CardBB{" +
                "nameOfOwner='" + nameOfOwner + '\'' +
                ", sumOfMany=" + sumOfMany +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardBB cardBB = (CardBB) o;
        return sumOfMany == cardBB.sumOfMany && Objects.equals(nameOfOwner, cardBB.nameOfOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfOwner, sumOfMany);
    }

    @Override
    public int getCardBalance() {
        return (int) (100 *sumOfMany);
    }
}
