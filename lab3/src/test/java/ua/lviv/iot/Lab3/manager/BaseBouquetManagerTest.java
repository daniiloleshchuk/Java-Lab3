package ua.lviv.iot.Lab3.manager;


import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.Lab3.model.Flower;

import java.util.ArrayList;


public abstract class BaseBouquetManagerTest {
    protected ArrayList<Flower> bouquet;

    @BeforeEach
    public void addFlowersToBouquet() {
        bouquet = new ArrayList<Flower>();
        bouquet.add(new Flower("flower", "red", 20, 70, "rose"));
        bouquet.add(new Flower("flower", "white", 10, 25, "romashka"));
        bouquet.add(new Flower("flower", "purple", 15, 40, "fialka"));
    }

}
