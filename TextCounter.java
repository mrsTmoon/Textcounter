package Examination;

public class TextCounter {
    // Deklarera veriabler som reknar antalet tecken och radar. Deras startvärd är 0
    private int lineCount = 0;
    private int characterCount = 0;

    public void addLine(String line) {
        lineCount++;
        characterCount += line.length();
    }
    //Metod som hämtar aktuella värdet från lineCount och retunerar värdet
    public int getLineCount() {
        return lineCount;
    }
    //Metod som hämtar aktuella värdet från characters och retunar värdet
    public int getCharacterCount() {
        return characterCount;
    }
}