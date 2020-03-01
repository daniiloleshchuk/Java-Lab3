package ua.lviv.iot.Lab3.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.Lab3.model.SortType;

public class Lab4 extends BaseBouquetManagerTest {
    @Test
    void sortWithStaticInner() {
        BouquetManagerUtils.sortByHeight(bouquet, SortType.ASCENDING);
        System.out.println(bouquet.get(0).getHeightInSm());
        System.out.println(bouquet.get(1).getHeightInSm());
        System.out.println(bouquet.get(2).getHeightInSm());
    }

    @Test
    void sortWithInnerClass() {
        BouquetManagerUtils bouquetManagerUtils = new BouquetManagerUtils();
        bouquetManagerUtils.sortByPrice(bouquet, SortType.ASCENDING);
        System.out.println(bouquet.get(0).getPriceInUAH());
        System.out.println(bouquet.get(1).getPriceInUAH());
        System.out.println(bouquet.get(2).getPriceInUAH());
    }

    @Test
    void sortWithAnonClass() {
        BouquetManagerUtils.sortByColor(bouquet, SortType.ASCENDING);
        System.out.println(bouquet.get(0).getColor());
        System.out.println(bouquet.get(1).getColor());
        System.out.println(bouquet.get(2).getColor());
    }

    @Test
    void sortViaLambda() {
        BouquetManagerUtils.sortingByLivingDays(bouquet, SortType.DESCENDING);
        System.out.println(bouquet.get(0).getHowMuchDaysCanLive());
        System.out.println(bouquet.get(1).getHowMuchDaysCanLive());
        System.out.println(bouquet.get(2).getHowMuchDaysCanLive());
    }


}
