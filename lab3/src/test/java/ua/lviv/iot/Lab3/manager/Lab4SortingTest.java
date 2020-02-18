package ua.lviv.iot.Lab3.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lab4SortingTest extends BaseBouquetManagerTest {
    @Test
    void staticInnerClassSorterTest() {
        bouquet.sort(new BouquetManagerUtils.FlowersInBouquetSorterByHeight());
        Assertions.assertEquals(10, bouquet.get(0).getHeightInSm());
        Assertions.assertEquals(15, bouquet.get(1).getHeightInSm());
        Assertions.assertEquals(20, bouquet.get(2).getHeightInSm());
    }

    @Test
    void innerClassSorterTest() {
        /*
        bouquet.sort(new BouquetManagerUtils.FlowersInBouquetSorterByPrice());
        Assertions.assertEquals(25,bouquet.get(0).getPriceInUAH());
        Assertions.assertEquals(40,bouquet.get(1).getPriceInUAH());
        Assertions.assertEquals(70,bouquet.get(2).getPriceInUAH());
        */
    }

    @Test
    void sortingViaLambdaTest() {
        bouquet.sort((o1, o2) -> o1.getHowMuchDaysCanLive() - o2.getHowMuchDaysCanLive());
        Assertions.assertEquals(2, bouquet.get(0).getHowMuchDaysCanLive());
        Assertions.assertEquals(3, bouquet.get(1).getHowMuchDaysCanLive());
        Assertions.assertEquals(6, bouquet.get(2).getHowMuchDaysCanLive());
    }

    @Test
    void sortingViaLambdaByLivingDaysTest() {
        BouquetManagerUtils.sortingViaLambdaByLivingDays(bouquet);
        Assertions.assertEquals(2, bouquet.get(0).getHowMuchDaysCanLive());
        Assertions.assertEquals(3, bouquet.get(1).getHowMuchDaysCanLive());
        Assertions.assertEquals(6, bouquet.get(2).getHowMuchDaysCanLive());
    }
}
