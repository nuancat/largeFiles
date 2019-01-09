package com.example.demo;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class FileGeneration {

    private static Random r = new Random();
    /**
     * Path to genetation file (will created if not exists)
     */
    static Path PATH = Paths.get("large.txt");
    /**
     * Quantity of flushes
     */
    static int FACTOR = 1;
    /**
     * With big quantity OutOfMemory Error may be thrown
     */
    static int LONG_QUANTITY_IN_WRITER_BUFFER = 1000000;

    /**
     * test file generation method. Could not start automatically
     *
     * @throws IOException something went wrong
     */
    @Ignore
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

