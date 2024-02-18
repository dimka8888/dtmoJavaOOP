package by.itacademy.ivanchikov.bankomat;

public class Main {
    public static void main(String[] args) {
        CardBB card1 = new CardBB(  "Dmitry", 5000);
        CardBB card2 = new CardBB(   "Victor", 10000);
        BancomatBB bancomatBB = new BancomatBB();
        bancomatBB.printBalance(card1);
        bancomatBB.printBalance(card2);

        CardPrior card3 = new CardPrior(  "Dmitry",   10000,    "4916989648272432");
        AtmPrior atmPrior = new AtmPrior();
        atmPrior.printCardInfo(card3);
        atmPrior.addCardBalance(card3,  2000);
        atmPrior.printCardInfo(card3);
        System.out.println("nith interfice");
    }
}
