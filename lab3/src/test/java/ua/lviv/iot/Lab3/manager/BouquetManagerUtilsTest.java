
package ua.lviv.iot.Lab3.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Lab3.model.SortType;

public class BouquetManagerUtilsTest extends BaseBouquetManagerTest {
    @Test
    public void testSortBouquetByPriceAsc() {
        BouquetManagerUtils.sortFlowersInBouquetByPrice(bouquet, SortType.ASCENDING);
        Assertions.assertEquals(25, bouquet.get(0).getPriceInUAH());
        Assertions.assertEquals(40, bouquet.get(1).getPriceInUAH());
        Assertions.assertEquals(70, bouquet.get(2).getPriceInUAH());
    }
    @Test void testSortFlowersInBouquetByHeight(){
        BouquetManagerUtils.sortFlowersInBouquetByHeight(bouquet,SortType.ASCENDING);
        Assertions.assertEquals(10,bouquet.get(0).getHeightInSm());
        Assertions.assertEquals(15,bouquet.get(1).getHeightInSm());
        Assertions.assertEquals(20,bouquet.get(2).getHeightInSm());
    }

}
