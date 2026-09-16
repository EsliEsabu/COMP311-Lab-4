//Esli Quest Esabu 24019733
import java.util.Scanner;

// Converts a whole number entered by the user into binary
public class Question4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = keyboard.nextInt();

        if (number == 0) {
            System.out.println("Binary: 0"); // special case, avoid the loop below
            return;
        }

        String binary = ""; // builds up the binary digits
        int n = Math.abs(number); // work with a positive copy, handle sign separately

        // classic method: divide by 2, keep the remainder, repeat
        while (n > 0) {
            binary = (n % 2) + binary; // new digit goes at the front
            n = n / 2;
        }

        if (number < 0) binary = "-" + binary; // reattach the sign if needed

        System.out.println("Binary: " + binary);
    }
}