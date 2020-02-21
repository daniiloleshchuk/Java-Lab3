package ua.lviv.iot.Lab3.manager;

import ua.lviv.iot.Lab3.model.Flower;
import ua.lviv.iot.Lab3.model.SortType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BouquetManagerUtils {

    //anon class with comparator
    private static Comparator<Flower> compareByColor = new Comparator<Flower>() {
        @Override
        public int compare(final Flower firstFlower, final Flower secondFlower) {
            return firstFlower.getColor().compareTo(secondFlower.getColor());
        }
    };

    //method that uses static class with comparator
    public static void sortByHeight(final List<Flower> bouquet, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(new FlowersInBouquetSorterByHeight());
        }
        if (sortType == SortType.DESCENDING) {
            bouquet.sort(new FlowersInBouquetSorterByHeight());
        }
    }

    //method that uses anon class with comparator
    public static void sortByColor(final List<Flower> bouquet, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(compareByColor);
        }
        if (sortType == SortType.DESCENDING) {
            bouquet.sort(compareByColor.reversed());
        }
    }

    //method that sorts via lambda
    public static void sortingByLivingDays(final ArrayList<Flower> bouquet) {
        bouquet.sort((o1, o2) -> o1.getHowMuchDaysCanLive() - o2.getHowMuchDaysCanLive());
    }

    //method that uses inner class with comparator
    public final void sortByPrice(final List<Flower> bouquet, final SortType sortType) {
        FlowersInBouquetSorterByPrice flowersInBouquetSorterByPrice = new FlowersInBouquetSorterByPrice();
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(new FlowersInBouquetSorterByPrice());
        }
        if (sortType == SortType.DESCENDING) {
            bouquet.sort(new FlowersInBouquetSorterByPrice());
        }
    }

    public final Comparator<Flower> getCompareByColor() {
        return compareByColor;
    }

    public final void setCompareByColor(final Comparator<Flower> compareViaColor) {
        this.compareByColor = compareViaColor;
    }

    //static class with comparator
    private static class FlowersInBouquetSorterByHeight implements Comparator<Flower> {
        @Override
        public int compare(final Flower firstFlower, final Flower secondFlower) {
            return firstFlower.getHeightInSm() - secondFlower.getHeightInSm();
        }
    }

    //inner class with comparator
    private class FlowersInBouquetSorterByPrice implements Comparator<Flower> {
        @Override
        public int compare(final Flower firstFlower, final Flower secondFlower) {
            return (int) (firstFlower.getPriceInUAH() - secondFlower.getPriceInUAH());
        }
    }
}
