package ua.lviv.iot.Lab3.manager;

import ua.lviv.iot.Lab3.model.Flower;

import java.util.ArrayList;
import java.util.List;

public class BouquetManager {
    private List<Flower> flowersInBouquet = new ArrayList<Flower>();

    public void addFlowerToBouquet(Flower... flowerToAdd) {
        for (Flower flower : flowerToAdd) {
            this.flowersInBouquet.add(flower);
        }
    }

    public void removeFlowerFromBouquet(Flower... flowerToRemove) {
        for (Flower flower : flowerToRemove) {
            this.flowersInBouquet.remove(flower);
        }
    }

    public void addFlowersToBouquet(List<Flower> flowersToAdd) {
        this.flowersInBouquet.addAll(flowersToAdd);
    }

    public void displayBouquetInfo() {
        for (Flower flower : this.flowersInBouquet) {
            System.out.println(flower);
        }
    }


    //this tasks (find operations) were not set in mine lab2-task but they are in lab3-task
    //so i decided it is better to add them myself
    public List<Flower> findFlowerWithColor(String color) {
        ArrayList<Flower> result = new ArrayList<Flower>();
        for (Flower flower : this.flowersInBouquet) {
            if (flower.getColor() == color) {
                result.add(flower);
            }
        }
        return result;
    }

    public List<Flower> findFlowerWithPriceLowerThan(double priceToCompare) {
        ArrayList<Flower> result = new ArrayList<Flower>();
        for (Flower flower : this.flowersInBouquet) {
            if (flower.getPriceInUAH() < priceToCompare) {
                result.add(flower);
            }
        }
        return result;
    }
}
