package by.itacademy.ivanchikov.bankomat;

public class AtmPrior {
    public void printCardInfo(CardPrior cardPrior) {
        System.out.println("Уважаемый клиент"    + cardPrior.getOrderNumer());
        System.out.println("На вашем счету"    + cardPrior.getBalance());
        System.out.println("Номер карты"   + cardPrior.getCardNumer());
    }
    public void addCardBalance(CardPrior cardPrior,double sum){
       cardPrior.setBalance(cardPrior.getBalance()+sum);

    }
}
