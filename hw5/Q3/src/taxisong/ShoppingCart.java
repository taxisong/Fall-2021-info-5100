package taxisong;

public class ShoppingCart{
    public int total = 0;

    public ShoppingCart(){
        super();
    }

    public void addItem(Item item){
        calculateTotal();
        total += item.getPrice();
    }
    public void removeItem(Item item){
        calculateTotal();
        total -= item.getPrice();
    }
    public int calculateTotal(){
        return total;
    }
    public void pay(PaymentStrategy paymentStrategy){
        System.out.println(paymentStrategy + " : $" + calculateTotal());
    }
}
