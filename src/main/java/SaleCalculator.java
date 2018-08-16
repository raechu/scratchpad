package main.java;

public class SaleCalculator {

    public int getCost(Item item, int quantity) {
        if(quantity > 10) {
            return item.getCost() * 10 + quantity * 20;
        }
        else {
            return quantity * 40;
        }
    }
}
