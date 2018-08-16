package myproject;

public class SaleCalculator {

    public int getCost(Item item, int quantity) {
        if(quantity > 10) {
            return item.getCost() * 10 + (quantity * item.getCost() / 2);
        }
        else {
            return quantity * item.getCost();
        }
    }
}
