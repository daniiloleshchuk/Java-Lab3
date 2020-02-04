package ua.lviv.iot.Lab3.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Lab3.model.Flower;

import java.util.List;

public class BouquetManagrTest {

    private BouquetManager bouquet;

    @BeforeEach
    public void testCreateBouquetAndFlowers() {
        bouquet = new BouquetManager();
        bouquet.addFlowerToBouquet(new Flower("flower", "red", 20, 70, "rose"));
        bouquet.addFlowerToBouquet(new Flower("flower", "white", 10, 25, "romashka"));
        bouquet.addFlowerToBouquet(new Flower("flower", "purple", 15, 40, "fialka"));
    }

    @Test
    public void testFindFlowerWithPriceLowerThan() {
        List<Flower> foundFlowers = bouquet.findFlowerWithPriceLowerThan(50);

        Assertions.assertEquals(2, foundFlowers.size());

        Assertions.assertEquals(25, foundFlowers.get(0).getPriceInUAH());
        Assertions.assertEquals(40, foundFlowers.get(1).getPriceInUAH());
    }

    @Test
    public void testFindFlowerWithColor(){
        List<Flower> foundFlowers = bouquet.findFlowerWithColor("red");

        Assertions.assertEquals(1,foundFlowers.size());

        Assertions.assertEquals("red",foundFlowers.get(0).getColor());
    }

}
