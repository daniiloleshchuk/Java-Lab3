package ua.lviv.iot.Lab3.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.Lab3.IOManager.ProductWriter;
import ua.lviv.iot.Lab3.model.Flower;
import ua.lviv.iot.Lab3.model.Vase;

import java.io.IOException;

public class Lab5 {

    @Test
    public void inputManager() throws IOException {
        Flower rose = new Flower("flower", "red", 20, 70, "rose", 6);
        Vase vase = new Vase("Vase", "blue", 30, 250, 500);
        ProductWriter.inputTextToFile("text.csv", "123", "Hi, World!", "Hello, World, from IoT");
    }

    @Test
    public void outputManager() throws IOException {
        ProductWriter.outputTextOfFile("text.csv");
    }

    @Test
    public void lab5() throws IOException {
        Flower rose = new Flower("flower", "red", 20, 70, "rose", 6);
        Vase vase = new Vase("Vase", "blue", 30, 250, 500);
        ProductWriter.inputTextToFile("text.csv", rose.toCSV(), vase.toCSV());
        ProductWriter.outputTextOfFile("text.csv");
    }
}
