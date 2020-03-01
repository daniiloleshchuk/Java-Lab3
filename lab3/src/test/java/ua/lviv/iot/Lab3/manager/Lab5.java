package ua.lviv.iot.Lab3.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Lab3.IOManager.ProductWriter;
import ua.lviv.iot.Lab3.model.Flower;
import ua.lviv.iot.Lab3.model.Vase;

import java.io.IOException;
import java.io.StringWriter;

public class Lab5 {

    @Test
    public void inputManager() throws IOException {
        Flower rose = new Flower("flower", "red", 20, 70, "rose", 6);
        Vase vase = new Vase("Vase", "blue", 30, 250, 500);
        ProductWriter.inputStaticTextToFile("text.csv", rose.toCSV(), vase.toCSV());
    }

    @Test
    public void outputManager() throws IOException {
        ProductWriter.outputStaticTextOfFile("text.csv");
    }

    @Test
    public void inputAndOutputTest() throws IOException {
        Flower rose = new Flower("flower", "red", 20, 70, "rose", 6);
        Vase vase = new Vase("Vase", "blue", 30, 250, 500);
        ProductWriter.inputStaticTextToFile("text.csv", rose.toCSV(), vase.toCSV());
        ProductWriter.outputStaticTextOfFile("text.csv");
    }

    @Test
    public void stringWriterTest() throws IOException {
        try {
            Flower rose = new Flower("flower", "red", 20, 70, "rose", 6);
            ProductWriter productStringWriter = new ProductWriter(new StringWriter());
            productStringWriter.inputText(rose.toCSV());
            String expectedExpression = rose.toCSV() + "\r\n";
            Assertions.assertEquals(expectedExpression, productStringWriter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
