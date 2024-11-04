package Examination;

import java.util.Scanner;
//Deklarera veriabler
public class TextReader {
    private TextCounter textCounter;
    private Scanner scanner;

    // Konstruktor för att initiera TextCounter och Scanner
    public TextReader() {
        textCounter = new TextCounter();
        scanner = new Scanner(System.in);
    }

    // Metod som läser in rader och hanterar avslutning
    public void readInput() {
        System.out.println("Write a few rows of text. If you want to stop the program, then write 'Stop':");

        while (true) {
            // Läser en rad text som User har skrivit
            String line = scanner.nextLine();
            //Kontrollera om User vill avsluta
            if (line.equalsIgnoreCase("stop")) {
                break; // Om User skriver 'stop' så avsluta loopen
            }
            textCounter.addLine(line);
        }
        printResult();
    }

    // Metod som skriver ut resultatet
    private void printResult() {
        System.out.println("Number of rows: " + textCounter.getLineCount());
        System.out.println("Number of characters: " + textCounter.getCharacterCount());
    }

    // main-metod som startar programmet
    public static void main(String[] args) {
        TextReader textReader = new TextReader();
        textReader.readInput();
    }
}

