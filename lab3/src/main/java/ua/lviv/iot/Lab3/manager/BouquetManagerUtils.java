package ua.lviv.iot.Lab3.manager;

import ua.lviv.iot.Lab3.model.Flower;
import ua.lviv.iot.Lab3.model.Product;
import ua.lviv.iot.Lab3.model.SortType;

import java.util.Comparator;
import java.util.List;

public class BouquetManagerUtils {
    public static void sortFlowersInBouquetByPrice(List<Flower> bouquet, SortType sortType) {
        System.out.println("called 'sortFlowersInBouquetByPrice' func");
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(Comparator.comparing(Product::getPriceInUAH));
        } else if (sortType == SortType.DESCENDING) {
            bouquet.sort(Comparator.comparing(Product::getPriceInUAH).reversed());
        } else {
            System.out.println("ERROR");
        }
    }

    public static void sortFlowersInBouquetByHeight(List<Flower> bouquet, SortType sortType) {
        System.out.println("called 'sortFlowersInBouquetByHeight' func");
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(Comparator.comparing(Product::getHeightInSm));
        } else if (sortType == SortType.DESCENDING) {
            bouquet.sort(Comparator.comparing(Product::getHeightInSm).reversed());
        } else {
            System.out.println("ERROR");
        }
    }

}
