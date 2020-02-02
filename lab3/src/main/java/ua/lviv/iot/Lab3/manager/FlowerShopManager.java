package ua.lviv.iot.Lab3.manager;

import ua.lviv.iot.Lab3.model.Product;

import java.util.ArrayList;

public class FlowerShopManager {
    ArrayList<Product> assortment = new ArrayList<Product>();

    public void addToAssortment(Product... productsToAdd) {
        for (Product product : productsToAdd) {
            this.assortment.add(product);
        }
    }

    public void removeFromAssortment(Product... productsToRemove) {
        for (Product product : productsToRemove) {
            this.assortment.remove(product);
        }
    }

    public void displayAssortmentInfo() {
        for (Product product : this.assortment) {
            System.out.println(product);
        }
    }
}
