package service;

import model.Food;

public class ShoppingCart {

    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double price = item.getAmount() * item.getPrice();
            total += price * (100 - item.getDiscount()) / 100;
        }
        return total;
    }

    public double getVegetarianTotalPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
