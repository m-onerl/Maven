import pl.edu.pwr.tinyLibrary.CSVProcessor;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CSVProcessor processor = new CSVProcessor(";");
        List<List<String>> records = processor.readCSV("C:\\Dane\\0002_14.csv");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer kolumny: ");
        int columnIndex;
        if (scanner.hasNextInt()) {
            columnIndex = scanner.nextInt();
            if (columnIndex >= 0 && columnIndex < records.get(0).size()) {
                double average = CSVProcessor.calculateAverage(records, columnIndex);
                System.out.println("Wynik średni z kolumny " + (columnIndex + 1) + ": " + average);

            }
        } else {
            System.out.println("Podaj numer kolumny obliczyć średnią");
        }
    }
}