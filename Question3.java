//Esli Quest Esabu 24019733
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Finds sum, smallest and largest of an int array, writes them to a file
public class Question3 {
    public static void main(String[] args) {
        int[] numbers = {23, 5, 67, 12, 89, 4, 45}; // sample data

        int sum = 0;
        int smallest = numbers[0]; // start by assuming the first element is smallest
        int largest = numbers[0];  // and also largest, then correct as we go

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] < smallest) smallest = numbers[i]; // found a new smallest
            if (numbers[i] > largest) largest = numbers[i];   // found a new largest
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("results.txt"));
            writer.println("Sum: " + sum);
            writer.println("Smallest: " + smallest);
            writer.println("Largest: " + largest);
            writer.close();

            System.out.println("Results written to results.txt");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}