package com.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        // Set up a stream to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Run the main method of the App class
        App.main(new String[]{});

        // Verify the output
        assertEquals("Hello World!\n", outputStream.toString());

        // Restore original System.out
        System.setOut(originalOut);
    }
}
