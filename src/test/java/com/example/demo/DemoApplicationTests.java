package com.example.demo;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class DemoApplicationTests {

    private static Random r = new Random();
    private static Path PATH = Paths.get("large.txt");
    private static int FACTOR = 1;
    private static int LONG_QUANTITY_IN_WRITER_BUFFER = 1000000;

    @Test
    public void createLargeFile() throws IOException {
        Files.createFile(PATH);
        for (int i = 0; i < FACTOR; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(r.nextLong());
            for (int j = 0; j < LONG_QUANTITY_IN_WRITER_BUFFER; j++) {
                sb.append(", ").append(r.nextLong());
            }
            Files.write(PATH, sb.toString().getBytes(), StandardOpenOption.APPEND);
        }
    }

}

