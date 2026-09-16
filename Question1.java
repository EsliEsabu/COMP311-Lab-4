
// Esli Quest Esabu - 24019733
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Reads words from names.txt into a String array (max 20 words)
public class Question1 {
    public static void main(String[] args) {
        String[] names = new String[20]; // array can hold up to 20 words
        int count = 0; // how many words we've stored so far

        // try-with-resources: the Scanner closes itself automatically, even if an error happens
        try (Scanner fileReader = new Scanner(new File("names.txt"))) {

            // read one word at a time until the file ends or the array is full
            while (fileReader.hasNext() && count < names.length) {
                names[count] = fileReader.next();
                count++;
            }

            // print out the words we stored, just to check it worked
            for (int i = 0; i < count; i++) {
                System.out.println(names[i]);
            }

        } catch (FileNotFoundException e) {
            // runs if names.txt isn't in the project folder
            System.out.println("names.txt not found.");
        }
    }
}