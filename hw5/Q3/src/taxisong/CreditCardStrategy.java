package taxisong;

public class CreditCardStrategy implements PaymentStrategy{
    private String cardNumber;

    public CreditCardStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int m) {
    }
}
