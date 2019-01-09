package com.example.demo;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 */
public class TestClass {
    @Before
    public static void preUse (){
        FileGeneration.PATH = Paths.get("test.txt");
        FileGeneration.FACTOR = 1;
        FileGeneration.LONG_QUANTITY_IN_WRITER_BUFFER = 500;
    }

    @Test
    public void test() throws IOException {
        FileGeneration fg = new FileGeneration();
        fg.createLargeFile();

    }
}
