import java.util.Scanner;

public class TrimString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String trimmedString = input.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");

        scanner.close();
    }
}
