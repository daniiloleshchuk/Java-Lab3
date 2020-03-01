package ua.lviv.iot.Lab3.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Lab3.model.Flower;

import java.util.List;

public class BouquetManagerTest extends BaseBouquetManagerTest {

    private BouquetManager bouquetManager;

    @BeforeEach
    public void setUp() {
        bouquetManager = new BouquetManager();
        bouquetManager.addFlowersToBouquet(bouquet);
    }

    @Test
    public void testFindFlowerWithPriceLowerThan() {
        List<Flower> flowers = bouquetManager.findFlowerWithPriceLowerThan(50);

        Assertions.assertEquals(2, flowers.size());

        Assertions.assertEquals(25, flowers.get(0).getPriceInUAH());
        Assertions.assertEquals(40, flowers.get(1).getPriceInUAH());
    }

    @Test
    public void testFindFlowerWithColor() {
        List<Flower> foundFlowers = bouquetManager.findFlowerWithColor("red");

        Assertions.assertEquals(1, foundFlowers.size());

        Assertions.assertEquals("red", foundFlowers.get(0).getColor());
    }
}
