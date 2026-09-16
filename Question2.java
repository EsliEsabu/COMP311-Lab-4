//Esli Quest Esabu 24019733
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Writes each value of a double array to a new file, one per line
public class Question2 {
    public static void main(String[] args) {
        double[] prices = {19.99, 5.50, 100.0, 42.75, 3.14}; // sample data

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("doubles.txt"));

            // loop through the array, writing one value per line
            for (int i = 0; i < prices.length; i++) {
                writer.println(prices[i]);
            }
            writer.close();

            System.out.println("Values written to doubles.txt");

        } catch (IOException e) {
            // runs if the file can't be created/written for some reason
            System.out.println("Error writing file.");
        }
    }
}