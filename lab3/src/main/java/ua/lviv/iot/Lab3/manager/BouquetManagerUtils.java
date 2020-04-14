package ua.lviv.iot.Lab3.manager;

import ua.lviv.iot.Lab3.model.Flower;
import ua.lviv.iot.Lab3.model.SortType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BouquetManagerUtils {
    private static FlowersInBouquetSorterByPrice flowersInBouquetSorterByPrice =
            new BouquetManagerUtils().new FlowersInBouquetSorterByPrice();

    //anon class with comparator
    private static Comparator<Flower> compareByColor = new Comparator<Flower>() {
        @Override
        public int compare(final Flower firstFlower, final Flower secondFlower) {
            return firstFlower.getColor().compareTo(secondFlower.getColor());
        }
    };

    //method that uses anon class with comparator
    public static void sortByColor(final List<Flower> bouquet, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(compareByColor);
        }
        if (sortType == SortType.DESCENDING) {
            bouquet.sort(compareByColor.reversed());
        }
    }

    //method that uses static class with comparator
    public static void sortByHeight(final List<Flower> bouquet, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(new FlowersInBouquetSorterByHeight());
        }
        if (sortType == SortType.DESCENDING) {
            bouquet.sort(new FlowersInBouquetSorterByHeight());
        }
    }

    //method that uses inner class with comparator
    public static final void sortByPrice(final List<Flower> bouquet, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            bouquet.sort(flowersInBouquetSorterByPrice);
        }
        if (sortType == SortType.DESCENDING) {
            bouquet.sort(flowersInBouquetSorterByPrice);
        }
    }

    //method that sorts via lambda
    public static void sortingByLivingDays(final ArrayList<Flower> bouquet, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            bouquet.sort((o1, o2) -> o1.getHowMuchDaysCanLive() - o2.getHowMuchDaysCanLive());
        }
        if (sortType == SortType.DESCENDING) {
            bouquet.sort((o1, o2) -> o2.getHowMuchDaysCanLive() - o1.getHowMuchDaysCanLive());
        }
    }

    public final Comparator<Flower> getCompareByColor() {
        return compareByColor;
    }

    public final void setCompareByColor(final Comparator<Flower> compareViaColor) {
        compareByColor = compareViaColor;
    }

    //static inner class with comparator
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
