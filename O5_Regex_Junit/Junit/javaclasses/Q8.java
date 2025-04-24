package javaclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Q8 {
    public void writeToFile(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes(StandardCharsets.UTF_8));
    }

    public String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
    }
}
