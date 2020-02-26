package ua.lviv.iot.Lab3.manager;

import ua.lviv.iot.Lab3.model.Product;

import java.util.ArrayList;

public class FlowerShopManager {
    private ArrayList<Product> assortment = new ArrayList<Product>();

    public final void addToAssortment(final Product... productsToAdd) {
        for (Product product : productsToAdd) {
            this.assortment.add(product);
        }
    }

    public final void removeFromAssortment(final Product... productsToRemove) {
        for (Product product : productsToRemove) {
            this.assortment.remove(product);
        }
    }

    public final void displayAssortmentInfo() {
        for (Product product : this.assortment) {
            System.out.println(product);
        }
    }
}
