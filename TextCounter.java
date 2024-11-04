package Examination;

public class TextCounter {

    private static int charCount;
    private static int lineCount;

    public TextCounter() {
        charCount = 0;
        lineCount = 0;
    }

    public static void countLine  (String line){
        charCount+=line.length();
        lineCount++;

    }
    public static int getCharCount() {
        return charCount;
    }
    public static int getLineCount() {
        return lineCount;
    }
}
