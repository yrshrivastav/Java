import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String line;
            do {
                System.out.println("Enter a line (type 'exit' to quit):");
                line = scanner.nextLine();
                writer.write(line);
                writer.newLine();
            } while (!line.equalsIgnoreCase("exit"));
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}