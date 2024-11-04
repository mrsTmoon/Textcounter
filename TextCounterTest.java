package Examination;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TextCounterTest {
    @Test
    public void testAddLines() {
        TextCounter textCounter = new TextCounter();
        textCounter.addLine("Hello");
        textCounter.addLine("Goodbye");
        assertEquals(2, textCounter.getLineCount(), "Number of rows should be 2");
        assertEquals(12, textCounter.getCharacterCount(), "Number of characters should be 12");
    }

    @Test
    public void testEmptyInput() {
        TextCounter textCounter = new TextCounter();
        assertEquals(0, textCounter.getLineCount(), "Number of rows is 0 for empty inpts");
        assertEquals(0, textCounter.getCharacterCount(), "Number of character is 0 for empty inputs");
    }

   public void testLargeInput() {
        TextCounter textCounter = new TextCounter();
        for (int i = 0; i < 3000; i++) {
            textCounter.addLine("Test");
        }
        assertEquals(1000, textCounter.getLineCount(), "Number of rows should be 3000");
        assertEquals(4000, textCounter.getCharacterCount(), "Number of characters should be 9000");
    }
  
}