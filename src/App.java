import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Pre-built ArrayList with names
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("Diana");
        namesList.add("Ethan");

        // File path where the names will be written
        String filePath = "names.txt";

        // Create a PrintWriter object for writing to the file
        try(PrintWriter writer = new PrintWriter(filePath)) {
            // TODO: Write code here to iterate through the ArrayList and write each name to the file

            
            // Close the PrintWriter
            writer.close();
            System.out.println("Names written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
