package ua.lviv.iot.Lab3.manager;

import ua.lviv.iot.Lab3.model.Flower;
import ua.lviv.iot.Lab3.model.Product;
import ua.lviv.iot.Lab3.model.SortType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BouquetManagerUtils {

    private Comparator<Flower> compareByColor = new Comparator<Flower>() {
        @Override
        public int compare(
                final Flower firstFlower, final Flower secondFlower) {
            return firstFlower.getColor().compareTo(secondFlower.getColor());

        }
    };

    public static void sortFlowersInBouquetByPrice(
            final List<Flower> bouquet, final SortType sortType) {
        System.out.println("called 'sortFlowersInBouquetByPrice' func");
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(Comparator.comparing(Product::getPriceInUAH));
        } else if (sortType == SortType.DESCENDING) {
            bouquet.sort(
                    Comparator.comparing(Product::getPriceInUAH).reversed());
        } else {
            System.out.println("ERROR");
        }
    }

    public static void sortFlowersInBouquetByHeight(
            final List<Flower> bouquet, final SortType sortType) {
        System.out.println("called 'sortFlowersInBouquetByHeight' func");
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(Comparator.comparing(Product::getHeightInSm));
        } else if (sortType == SortType.DESCENDING) {
            bouquet.sort(
                    Comparator.comparing(Product::getHeightInSm).reversed());
        } else {
            System.out.println("ERROR");
        }
    }

    public static void sortingViaLambdaByLivingDays(
            final ArrayList<Flower> bouquet) {
        bouquet.sort(
                (o1, o2) -> o1.getHowMuchDaysCanLive()
                        - o2.getHowMuchDaysCanLive());
    }

    public final Comparator<Flower> getCompareByColor() {
        return compareByColor;
    }

    public final void  setCompareByColor(
            final Comparator<Flower> compareViaColor) {
        this.compareByColor = compareViaColor;
    }

    static class FlowersInBouquetSorterByHeight
            implements Comparator<Flower> {
        @Override
        public int compare(
                final Flower firstFlower, final Flower secondFlower) {
            return firstFlower.getHeightInSm()
                    - secondFlower.getHeightInSm();
        }
    }

    class FlowersInBouquetSorterByPrice
            implements Comparator<Flower> {
        @Override
        public int compare(
                final Flower firstFlower, final Flower secondFlower) {
            return (int) (
                    firstFlower.getPriceInUAH() - secondFlower.getPriceInUAH());
        }
    }
}
