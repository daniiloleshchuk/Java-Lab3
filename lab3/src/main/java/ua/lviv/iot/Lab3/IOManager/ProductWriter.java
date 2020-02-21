package ua.lviv.iot.Lab3.IOManager;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class ProductWriter {
    public static void inputTextToFile(final String fileName, final String... lines) throws IOException {
        final File file = new File(fileName);
        Writer textWriter = new FileWriter(file);
        for (String line : lines) {
            textWriter.write(line);
            textWriter.write("\r\n");
        }
        textWriter.flush();
    }

    public static void outputTextOfFile(final String file) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(file));
        BufferedReader textReader = new BufferedReader(new FileReader(file));
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
