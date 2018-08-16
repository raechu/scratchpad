package main.java;

public class Item {

    public int getCost(int quantity) {
        if(quantity > 10) {
            return 400 + quantity * 20;
        }
        else {
            return quantity * 40;
        }
    }
}
