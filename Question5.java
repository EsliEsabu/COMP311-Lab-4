//Esli Quest Esabu 24019733
import java.util.Scanner;

// Checks if a word or phrase is a palindrome (ignoring case and spaces)
public class Question5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = keyboard.nextLine();

        // remove spaces and lowercase everything so "Level" == "L e v e l"
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // reverse the cleaned string and compare it to the original
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}