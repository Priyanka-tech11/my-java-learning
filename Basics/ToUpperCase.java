import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String upperCaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);

        scanner.close();
    }
}
