package ua.lviv.iot.Lab3.IOManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ProductWriter {

    private Writer writer;

    public ProductWriter(final Writer writer) {
        this.writer = writer;
    }

    public static void inputStaticTextToFile(final String fileName, final String... lines) throws IOException {
        final File file = new File(fileName);
        Writer writer = new FileWriter(file);
        for (String line : lines) {
            writer.write(line);
            writer.write("\r\n");
        }
        writer.flush();

    }

    public static void outputStaticTextOfFile(final String file) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(file));
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public final void inputText(final String... lines) throws IOException {
        for (String line : lines) {
            writer.write(line);
            writer.write("\r\n");
        }
        writer.flush();
    }

    @Override
    public final String toString() {
        return writer.toString();
    }
}
