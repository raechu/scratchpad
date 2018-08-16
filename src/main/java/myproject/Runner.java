package myproject;

public class Runner {

    public static void main(String[] args) {
        Item item = new Item(15);
        SaleCalculator saleCalculator = new SaleCalculator();
        System.out.println("Price: $" + saleCalculator.getCost(item, 20));
    }
}
