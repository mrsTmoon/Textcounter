package Examination;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TextCounterTest {
    // Testfall för att verifiera den grundläggande funktionaliteten för att lägga till rader
    @Test

    public void testAddLines() {
        TextCounter textCounter = new TextCounter();
        // Lägg till två rader med text till räknaren
        textCounter.addLine("Hello");
        textCounter.addLine("Goodbye");
        // Kontrollera att radantalet är 2
        assertEquals(2, textCounter.getLineCount(), "Number of rows should be 2");
        // Kontrollera att det totala teckenantalet är 12 (5 för "Hello" + 7 för "Goodbye")
        assertEquals(12, textCounter.getCharacterCount(), "Number of characters should be 12");
    }

    @Test
    // Testfall för att verifiera beteendet med tom indata
    public void testEmptyInput() {
        TextCounter textCounter = new TextCounter();
        // Kontrollera att radantalet är 0 för tom indata
        assertEquals(0, textCounter.getLineCount(), "Number of rows is 0 for empty inpts");
        assertEquals(0, textCounter.getCharacterCount(), "Number of character is 0 for empty inputs");
    }

   public void testLargeInput() {
        TextCounter textCounter = new TextCounter();
       // Lägg till 3000 rader med texten "Test"
        for (int i = 0; i < 3000; i++) {
            textCounter.addLine("Test");
        }
       // Kontrollera att radantalet är 3000
        assertEquals(1000, textCounter.getLineCount(), "Number of rows should be 3000");
       // Kontrollera att det totala teckenantalet är 12000 (4 tecken * 3000 rader)
        assertEquals(4000, textCounter.getCharacterCount(), "Number of characters should be 9000");
    }
  
}